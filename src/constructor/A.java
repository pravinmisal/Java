package constructor;

public class A {
//calling of constructor inside another constructor by using this();at first line
	public A() {
		System.out.println("zero constructor");
		
	}
	public A(char c){
		this(50,"pravin");
		System.out.println("one argument constructor");
	}
	
	public A (int a , String b) {
		this();
		System.out.println("two argument constructor");
	}
	public A(String b , int a) {
		this(50,"pravin");
		System.out.println("two argument constructor change");
		
	}
	public static void main(String[] args) {
		
		A v1 = new A ("pravin", 50);
	}
	
	
}
