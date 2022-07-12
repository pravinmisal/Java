package polymorphism;

public class Test3 {

	public Test3() {
		System.out.println("zero argument");
	}
	public Test3(int a) {
		System.out.println("1 argument constructor");
	}public Test3(int x,float y) {
		System.out.println("2 argument constructor");
	
}public static void main(String[] args) {
	Test3 t = new Test3(10,25.50f);
	
	
	
}




}
