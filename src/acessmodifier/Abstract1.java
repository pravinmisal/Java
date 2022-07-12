package acessmodifier;

public class Abstract1 extends  Abstract{

	
	public void requestpage() {
		System.out.println("request method");
	}

	
	public void uploadpage() {
		System.out.println("upload method");
		
	}public static void main(String[] args) {
		Abstract1 aa= new Abstract1();
		aa.uploadpage();
		aa.requestpage();
		aa.loginpage();
		aa.homepage();
	}

	
}
