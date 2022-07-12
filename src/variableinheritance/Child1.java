package variableinheritance;

public class Child1 extends Parent1 {
	String s ="nonstatic variable from Child1";
	static	String j="static variable from Child1"	;
	
public void bike() {
	
System.out.println("bike from Child1");
System.out.println(s);
System.out.println(this.s);
System.out.println(j);
System.out.println(super.s);
System.out.println(super.j);
}public static void m2() {
	Child1 c =new Child1();
	System.out.println(c.s);
	System.out.println(j);
	System.out.println(Parent1.j);
	Parent1 p = new Parent1();
	System.out.println(p.s);
}

public static void main(String[] args) {
           Child1 c =new Child1(); 
           c.bike();
           m2();
          
   }
	
}

