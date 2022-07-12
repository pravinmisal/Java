package categoriesofmethod;
//method with no return and argument
public class Class5 {
public static void m1(int a , int b) {
	System.out.println(a);
	System.out.println(b);
	
}
public static void add(int i , int j) {
	int k=i+j;
	System.out.println(k);
	System.out.println("method one");
	m1(20, 20);
	
}public static void main(String[] args) {
	m1(50,80);
	m1(40,40);
	add(20,50);
	add(10,10);
	
}

	
	
}
