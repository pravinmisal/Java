package exceptionalpractice;

public class NullPointerExceptional {
	static NullPointerExceptional np;
	
public void m1() {
	System.out.println("m1 is executing");
}
public static void main(String[] args) {
	try {
		np.m1();
	}
	catch(ArithmeticException s) {
		System.out.println("arithmetic exceptional");
	}
	catch(NullPointerException a) {
		System.out.println("null pointer exceptional");
	}System.out.println("After catch block");
}
}
