package test.util;

public class Test {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		Integer c = 2;
		Integer d = 2;
		Integer e = 4444;
		Integer f = 4444;
		
		Integer g=1;

		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println("c.equals(d):  "+c.equals(d));
		System.out.println(e==f);
		System.out.println("e.equals(f):  "+e.equals(f));
		System.out.println(a==g);
		System.out.println(c.equals(d));
		System.out.println(c.equals(e));
		
		
	}
}
