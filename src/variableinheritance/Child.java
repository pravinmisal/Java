package variableinheritance;

public class Child extends Parent {
	String s = "non static variable from child class";
	static String j ="static variable from child class";
	
	
public void bike() {
	System.out.println("bike method from child class");
	System.out.println(s);
	System.out.println(this.s);
	System.out.println(j);
	System.out.println(super.s);
}

public static void tractor () {
	System.out.println("tractor method from child java");
	Parent p = new Parent();
System.out.println(p.s);
System.out.println(Parent.j);
	
}
public static void main(String[] args) {
	Child c = new Child();
	c.bike();
	tractor();
}
}
