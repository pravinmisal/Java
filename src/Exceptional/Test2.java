package Exceptional;

public class Test2 {
public static void main(String[] args) {
	try {
		System.out.println("first line");
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("interrupted Exception");
	}
	System.out.println("last line");

}
}
