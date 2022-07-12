package acessmodifierrivision;

public class Abstract2 extends Abstract1 {


	public void downloadpage() {
		System.out.println("downloadpage method");
	}
public static void main(String[] args) {
	Abstract2 aa = new Abstract2();
	
	aa.downloadpage();
	aa.loginpage();
	aa.homepage();
	aa.requestpage();
	aa.uploadpage();
}
}
