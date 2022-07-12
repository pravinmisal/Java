package operator;

public class LogicalOperator {
public static void main(String[] args) {
	 
	//logical AND operator   "&&"
	int i = 50 ;
	int j =20;
boolean k	=(i>20)      &&    (j<50);
System.out.println(k);// true
	boolean l= (i==20)&&(j<50);
	System.out.println(l);
	
	//OR operator  "||"
	boolean h = (i>20)||(j<50);
	System.out.println(h);
	
	boolean n = (i==20)||(j<50);
	
	System.out.println(n);
	boolean o = i !=20;
	System.out.println(o);
	boolean p =!(i>50);//true
}
	
	
}
