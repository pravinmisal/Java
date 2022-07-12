package categoriesofmethod;
//method with return type and no argument
public class Class3 {
public static int m4 () {
	System.out.println("method with no return and with argument");
	return 100;
	
}
	public String m5() {
		String s1 = "corporate";
		System.out.println(s1);
		return "velocity";
	}
	public static void main(String[] args) {
		int k=m4();
		System.out.println(k);
		Class3 v = new Class3();
	String h=v.m5();
	System.out.println(h);
		
		
	}
}
