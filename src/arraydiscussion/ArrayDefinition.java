package arraydiscussion;

public class ArrayDefinition {
public static void main(String[] args) {
	
//1.with newkeyword
	int[] a= new int[5];
	a[0] = 10;
	a[1] = 21;
	a[2] = 2;
	a[3] = 60;
	a[4] = 3;
System.out.println(a[2]);
	for(int i=0;i<5;i++) {
		System.out.println(a[i]);
	}
	/////////////////////////////////////////////////////////////////////////
	int[] b=new int[5];
	b[0] = 10;
	b[1] = 21;
	b[2] = 2;
	b[3] = 60;
	for(int i=0; i<5;i++) {
		System.out.println(b[i]);
	}
	
	
	
	
	
	
	
	
	
}
}
