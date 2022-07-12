package categoriesofmethod;

public class Class4 {

	static int currentroll= 0;
	String name;
	int rollnumber;
	public double substraction () {
		double d= 56;
		double e = 3.5689;
		double f =d-e;
		System.out.println("substracted value is"+f);
		return f;
	}
	public int autorollincrementer () {
			currentroll = currentroll +1;
			System.out.println("current roll");
			return currentroll;
		
	}
	public static void main(String[] args) {
		Class4 v =new Class4();
	double k=v.substraction();
	System.out.println(k);
	Class4 t1 = new Class4();
	t1.name="ramesh";
	t1.rollnumber=t1.autorollincrementer();
	Class4 t2 =new Class4();
	t2.name = "pravin";
	t2.rollnumber =t2.autorollincrementer();
	System.out.println(t1.rollnumber);
	System.out.println(t2.rollnumber);
	
	
	}
}
