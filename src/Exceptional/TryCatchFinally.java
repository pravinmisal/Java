package Exceptional;

public class TryCatchFinally {
public static void main(String[] args) {
	try {
		int i=10;
		int j=0;     //if j=2or another value then exception is not came then only
		int k=i/j;    //execute finally block
		
	}
	catch(ArithmeticException e) {
	String message	=e.getMessage();
		System.out.println(message);
		System.out.println("catch block is executing");
	}
	finally {
	System.out.println("finally");
	}
}
}
