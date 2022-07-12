package exceptionalpractice;

public class Test1 {
public static void main(String[] args) {
	try {
		System.out.println("first line");
		Thread.sleep(5000);
	}catch(InterruptedException e){
		System.out.println("Catch Block is executing");
	}
	
	System.out.println("last line");
	
}
}
