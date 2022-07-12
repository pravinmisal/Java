package polymorphism;

public class A {
	public void m1() {
		System.out.println("method one");
	}public void m1(boolean b) {
		System.out.println(b);
	}
	public void namechange(String name, int documentid) {
		System.out.println("name has been sucessfully updated");

}
	public void namechange (String name, int documentid,String marriagecertificate) {
		System.out.println("name has been updated ");
	}
	public  int m1(double d) {
		System.out.println("return type");
		return 50;
	}
	public void m1(int a) {
		System.out.println("public method ");
	}
	private void m1(long k) {
		System.out.println("private method ");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m1(false);
		a.namechange("pravin", 1);
		a.namechange("misal", 25, "prain misal");
		int k=a.m1(2.4);
		System.out.println(k);
		a.m1(20);
		a.m1(25l);
		
	}
}