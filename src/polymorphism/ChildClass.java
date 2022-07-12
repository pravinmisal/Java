package polymorphism;

public class ChildClass extends ParentClass {
public void bike () {
	System.out.println("bike method from child class");
}
public void m1() {
	System.out.println("m1 method from parent class");
}
public int m2() {
	System.out.println("m2 method from child class");
	return 30;
}
public  void m3() {
	System.out.println("m3 method");
}
public void m4() {
	System.out.println("m4 method from child class");
}
public static void main(String[] args) {
	ChildClass c = new ChildClass();
	c.m1();
	ParentClass p= new ParentClass();
	p.m1();
}
}
