package polymorphism;

public class Test2 {
	public static void main(int a) {
		System.out.println("inside int");
		
	}public static void main(char b) {
		System.out.println("inside char");
		
	}public static void main(boolean b) {
		System.out.println("inside boolean");
		
	}public static void main(String[] args) {
		main(1);
		main('*');
		main(false);
	}
}
