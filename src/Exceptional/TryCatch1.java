package Exceptional;



public class TryCatch1 {
public static void main(String[] args) {
	
	try {
		  int i =10;
          int j= 0;
          int k =i/j; //Risk code
          System.out.println(k);

	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic catch is executing");
	}
	
	
	System.out.println("After the execution handling");
}
}
