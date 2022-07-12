package Overridding;

public class Child extends Parent{
public void m1() {
	System.out.println("m1 method from child class");
}
public void m2() {
	System.out.println("m2 method from child class");
}public int m4() {
	System.out.println("m4 from child");
	return 90;
}
public  void m5() {
	System.out.println("m5 from child");
}
protected void m6() {
	System.out.println("m6 from child");
}
public static void main(String[] args) {
	Child c = new Child();
	c.m1(); // m1 from child
	c.m2();// m2 from child
	c.m3();//m3 from parent acessible in child
	int k=c.m4(); //m4 return from child
	c.m6();
	
	System.out.println(k);
	Parent p = new Parent();
	p.m1();//m1 from parent
	p.m2();// m2 from parent
	int h=p.m4();//m4 return from parent
	System.out.println(h);
	p.m6();
// if parent class is A and child class is B then u can create object like as
// A a = new B();
	Parent pp = new Child();
	pp.m6();//m6 overridding then object based class uski method run hogi
	pp.m3();//m3 is not overridding then that time reference variable 
	//class ki method run hogi
}
}
