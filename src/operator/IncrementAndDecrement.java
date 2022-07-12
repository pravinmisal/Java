package operator;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x = 10;
		int y = x++;
		System.out.println(x);//11
		System.out.println(y);//10
		int z = ++x;
		System.out.println(x);//12
		System.out.println(z);//12
		
		int w =x--;
		System.out.println(x);//11
		System.out.println(w);//12
		
		int k =--x;
		System.out.println(x);//10
		System.out.println(k);//10
	}
	

	
	
	
	
	
	
	
	
}
