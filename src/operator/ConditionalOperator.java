package operator;

public class ConditionalOperator {
public static void main(String[] args) {
	//1. greater than operator '>'
	int i =100;
	int j =20;
	boolean r =i>j;
	System.out.println(r);//true
	if (i<j) {
		System.out.println("if is executing");
	}
	
	else {
		System.out.println("else is executing");
	}
	//2.greater than or equal to">="
boolean	s = i>=j;
System.out.println(s);
	//3.less than "<"
	boolean t =j<i;
	System.out.println(t);
	
	//4.less than equal to "<="
boolean m=	i <=100;
	System.out.println(m);
	
//5. equal to operator	"=="
	boolean w = i==j;
	System.out.println(w);
	
	if (i==j) {
		System.out.println("if is executing");
	}
	else {
		System.out.println("else is executing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
