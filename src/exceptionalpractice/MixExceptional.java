package exceptionalpractice;

public class MixExceptional {
	public static void main(String[] args) {
		int k;
		try {
			int i=10;
			int j=0;
			k=i/j;
			System.out.println(k);
	}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Array exceptional ");
}catch(NullPointerException j) {
	System.out.println("nullpointer exceptional");
}
		catch(ClassCastException b) {
			System.out.println("ClassCastException");
		}
		catch (Exception d) {
			System.out.println("Exception D");
		}
		catch(Throwable q) {
			
			System.out.println("throwable block");
		}System.out.println("After the exceptionl handling");
}
}
