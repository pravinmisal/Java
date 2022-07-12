package variableinjava;

public class Class1 {
int i = 10;
String s= "pravin";
static int i1=20;
static String k="kashi";
public static void m1() {
	int i1=50;
	System.out.println(i1);
	i1=i1+80;
	System.out.println(i1);
	System.out.println(Class1.i1);
	
	}
public void m2() {
	int i1 = 50;
	System.out.println(i);
	System.out.println(this.i);
	System.out.println(Class1.i1);
}

public static void main(String[] args) {
	Class1 v = new Class1();
	v.m2();
}
}
