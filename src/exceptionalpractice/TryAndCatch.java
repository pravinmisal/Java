package exceptionalpractice;

public class TryAndCatch {
public static void main(String[] args) {
	try {
		int i =10;
		int j=0;
		int k=i/j;
		System.out.println(k);
	}
	catch(NullPointerException a) {
		System.out.println("array is executing");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("null is executing");
	}
	catch(ArithmeticException l) {
		System.out.println("Arithmetic exception is executing");
	}System.out.println("After the exception handling");
}
}
