package casting;

public class PrimitiveCasting {
public static void main(String[] args) {
	//implicit casting
	byte b = 20;

	int c = (int) b;
	System.out.println(c);// 20
	double d = (double) c;
	System.out.println(d);//20
//Explicit
	int i=50;
	     byte k = (byte) i;
	     System.out.println(k);//50
	     double g=5.66;
	     long j = (long)g;
	     System.out.println(j);
}
   
}
