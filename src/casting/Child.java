package casting;

public class Child extends Parent {
	public void m1() {
		System.out.println("m1 method from Child class");

	}
public static void main(String[] args) {
	Child c =new Child ();
	  Parent  p =(Parent)c;//up casting
	  p.m1();
	  p.m2();
	  Parent d=new Parent();
	//    Child cc = (Child)d;
	//    cc.m1();
	   Child g=(Child)p;
	   g.m1();
}
}
