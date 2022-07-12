package Exceptional;

public class TryFinally {
public static void main(String[] args) {
	try {
		System.out.println("try Block");
        int i =10;
        int j= 0;
        int k =i/j; //Risk code
        System.out.println(k);}
//	finally block is used after try but he is not handling exception
//	use also after catch
	finally {
		System.out.println("finally");
	}
	
}
}
