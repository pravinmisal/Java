package polymorphism;

public class Test {
public void m1(String s) {
	System.out.println("one argument method");
	
	
}public void m1() {
	System.out.println("no argument method");
	
}
public static void m1(boolean b) {
	System.out.println("boolean argument");
}public int m1(double d) {
	System.out.println("m1 method from int argument");
	return 50;
}
public void namechange(String name,int documentid) {
	System.out.println("name has been sucessfully updated " );
}
public void namechange(String name, int documentid, String marriagecertificate) {
	System.out.println("name has been updated as per certificate ");
}

public static void main(String[] args) {
	Test t = new Test();
	t.m1("pravin");
	t.m1();
	t.namechange("pravin",5);
	t.namechange("pravin" , 4, "pawar");
	int k =t.m1(5.66);
	System.out.println(k);
}

	}

