package constructor;

public class B {
	public B () {
		System.out.println("constructor is executing");
		String s = "abc";
		int i = 10;
		System.out.println(s+i);
		
	}
	public B (int i) {
		System.out.println("one argument constructor");
		
	}
	public B (String s,double d, boolean b) {
		
		System.out.println("three argument");
		System.out.println(s+d+b);
	}
	public void m2() {
		System.out.println("method 2");
	}
public static void m1() {
	System.out.println("m1 method");
}
public static void main(String[] args) {
	B v = new B();
	
	v.m2();
	B v2= new B(50);
	B v3= new B("pravin", 5.6, false);
	
}
}
