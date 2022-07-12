package inheritance;

public class B extends A {
public B() {
	super(50);
	System.out.println("constructor from B class");
}

public static void main(String[] args) {
	B c = new B();
}
}
