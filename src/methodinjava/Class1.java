package methodinjava;

public class Class1 {

	public static void m1() {
		System.out.println("executing method one");
	}
	public static void m2() {
	System.out.println("method two");
		
		Class1 v = new Class1();
		v.m3();
	}
	public void m3() {
		m1();
		System.out.println("method three");
	}
	
	
	
	public static void main(String[] args) {
		
	m2();
		
		
	}
}
