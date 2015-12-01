package test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import test.util.entity.BaseBean;
import test.util.entity.Person;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TestXmlConverter {

	public static void main(String[] args) {
		Random r = new Random(47);
		System.out.println(Math.abs(r.nextInt()));
		System.out.println(Math.round(Math.random()*10000+10000));
		/*
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		Person p = new Person();
		p.setName("nnnn");
		p.setAge(55);
		Person p1 = new Person();
		p1.setName("xxxxxxx");
		p1.setAge(44);
		List<Person> pList = new ArrayList<Person>();
		pList.add(p);
		pList.add(p1);
//		xstream.alias("root", BaseBean.class);    
//		xstream.alias("person", Person.class);    
//		xstream.aliasField("list", BaseBean.class, "userList"); 
		
		String xmlStr = xstream.toXML(pList);
		System.out.println(xmlStr);
		
		XStream xs1 = new XStream(new DomDriver());
		xs1.autodetectAnnotations(true);
		
		String xmls = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data>";
		xmls += "<message><status>0</status><value>处理成功</value></message>";
		xmls += "<chinaTelecomUnicomInfos>";
		xmls += "<chinaTelecomUnicomInfo>";
		xmls += "<message><status>0</status><value>查询成功</value></message>";
		xmls += "<telInput>02032070210</telInput>";
		xmls += "</chinaTelecomUnicomInfo>";
		xmls += "</chinaTelecomUnicomInfos>";
		xmls += "</data>";
		
		xs1.alias("data", XmlBaseResult.class);
		xs1.alias("message", XmlMessage.class);
		xs1.aliasField("message", XmlBaseResult.class, "xmlMessage");
		xs1.alias("chinaTelecomUnicomInfo", ChinaTelecomUnicomInfo.class);
		xs1.aliasField("message", ChinaTelecomUnicomInfo.class, "xmlMessage");
		
		xs1.aliasField("message", XmlListResult.class, "xmlMessage");
		xs1.aliasField("chinaTelecomUnicomInfos", XmlListResult.class, "infos");
		
		XmlBaseResult b = new XmlBaseResult();
		XmlMessage xmlMessage = new XmlMessage();
		xmlMessage.setStatus("00");
		xmlMessage.setValue("dfsd");
		b.setXmlMessage(xmlMessage);
		String s = xs1.toXML(b);
		System.out.println(s);
		
		XmlBaseResult result = (XmlBaseResult)xs1.fromXML(xmls);
		XmlMessage msg = result.getXmlMessage();
		System.out.println(msg.getStatus());
		System.out.println(msg.getValue());
		
	*/}
}
