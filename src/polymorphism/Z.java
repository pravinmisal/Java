package polymorphism;

public class Z extends Y{
	String s= "def";
	public void m2() {
		System.out.println("m2 method from Z");
	}
	public void m3() {
		System.out.println("m3 method from Z");
	}
	public static void m8() {
		System.out.println("m8 from z");
	}
public static void main(String[] args) {
	Z z = new Z();
	z.m2();//acess m2 from z class
	z.m1();//acess m2 from y class
	z.m8();
	System.out.println(z.s);//def
	
	Y y= new Y();
	y.m2();//acess m2 from y class
	y.m8();
	System.out.println(y.s);//abc
	
	Y yy= new Z();
	yy.m2(); //acess m2 from z class method overridding hai to jiska object 
	//hota hai uske base ki method run hogi
	yy.m4();//acess m4 from y class agar method overridding nahi hai to 
	//reference  variable kiska hai us class ki method run hogi
	yy.m8();
	System.out.println(yy.s);//def
	
}
}
