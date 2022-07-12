package acessmodifier;

public class AcTest2 {

public void m1() {
	System.out.println("method 1");
}public static void main(String[] args) {
	AcTest1 a= new AcTest1();
	a.m2();
	System.out.println(a.i);
}
	
}

