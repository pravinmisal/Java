package acessmodifier;

public class AcTest1 extends AcTest2{
	protected int i=20;
	protected static void m2() {
		System.out.println("method 2");
	}

	public static void main(String[] args) {
		AcTest1 a= new AcTest1();
		a.m2();
	}
}

