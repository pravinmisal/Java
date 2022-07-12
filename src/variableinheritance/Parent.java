package variableinheritance;
public class Parent {
	
	String s= "nonstatic variable from parent class";
	static String j ="static variable from parent class";
			
	
	public void home() {
		System.out.println("home method from parent class");
	}
	public void car() {
		System.out.println("car method from parent class");
	}
    public void furniture() {
	System.out.println("furniture method from parent class");
}
    public static void property() {
    	System.out.println("property method from parent class");
    }
}
