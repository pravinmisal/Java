package constructor;
//it is a special block which always get execute whenever we create an object
//two types of constructor
//1default constructor.
//user define constructor
//parameterized constructor or argument constructor.
public class Class1 {
//	public Class1() {
		
//}

	public Class1() {
		System.out.println("constructor is executing");
		String s = "abc";
		int i =10;
		System.out.println(s+i);
	}
	public Class1(int a, int b) {
		int c =a+b;
		System.out.println(c);
	}
	
	public void m1() {
		System.out.println("method one");
	}
	public static void main(String[] args) {
		Class1 v =new Class1();
		Class1 v1= new Class1(50,40);
		Class1 v3 = new Class1();
		v3.m1();
		
	}
}
