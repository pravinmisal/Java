package categoriesofmethod;
//method with return and with argument
public class Class6 {
public static int m1(String s1, int i) {
	s1 = s1+"velocity";
	System.out.println("value of s1 is "+s1);
	
	i=i+2;
			System.out.println("value of i is "+i);
	
	return i;
}public static void main(String[] args) {
	int k = m1("pune",50);
	System.out.println(k);
	
	
}
	
	
	
	
	
	
	
}
