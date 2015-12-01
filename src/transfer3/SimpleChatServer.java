package transfer3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author notifier
 * @create 2010-9-25 下午07:06:54
 * @version 1.0
 */
public class SimpleChatServer
{
	// 保存客户端列表
	private ArrayList clientList = new ArrayList();;
	
	public static void main(String[] args)
	{
		new SimpleChatServer().startUp();
	}
	
	/**
	 * 负责服务器端的启动
	 *
	 */
	public void startUp()
	{
		try
		{
			// 创建服务器端ServerSocket连接,监听端口号5000
			ServerSocket serverSocket = new ServerSocket(5000);
			
			// 轮询等待客户端请求
			while(true)
			{
				// 等待客户端请求,无请求则闲置;有请求到来时,返回一个对该请求的socket连接
				Socket clientSocket = serverSocket.accept();
				
				// 将该客户端加入到列表中
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientList.add(writer);
				
				// 创建ClientHandler对象,通过socket连接通信
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();

				System.out.println("有Client连进来");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 客户端处理类, 主要负责:
	 * 1.接收客户端发来的消息
	 * 2.将消息转发其他客户端
	 * @author sdniu
	 * @create 2010-9-26 上午10:00:18
	 * @version 1.0
	 */
	public class ClientHandler implements Runnable
	{
		private BufferedReader reader;
		private Socket socket;
		
		/**
		 * ClientHandler的构造函数
		 * @param clientSocket
		 */
		public ClientHandler(Socket clientSocket)
		{
			
			try
			{
				// 得到socket连接
				socket = clientSocket;
				
				// 得到客户端发来的消息
				InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
				reader = new BufferedReader(isReader);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		public void run()
		{
			String message;
			try
			{
				while((message = reader.readLine()) != null)
				{
					System.out.println("客户端消息: " + message);
					// 将客户端发来的消息转发所有客户端
					notifyAllClients(message);
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * @param message
	 */
	public void notifyAllClients(String message)
	{
		// 得到客户端列表的迭代器,语法格式为 Iterator it = clientList.iterator();
		Iterator it = clientList.iterator();
		
		while(it.hasNext())
		{
			try
			{
				// 得到的Iterator别忘了强制转换回PrintWriter
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(message);
				writer.flush();
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		}
	}
}
