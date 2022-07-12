package Exceptional;

public class NullPointerException {
	static NullPointerException ne;

public void m1() {
	System.out.println("m1 method is executing");
}
	public static void main(String[] args) {
		try{
			ne.m1();
		
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("Null Pointer Exception is executing");
		}System.out.println("after catch block");
	}
	
}
