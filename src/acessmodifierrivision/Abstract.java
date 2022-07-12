package acessmodifierrivision;

abstract public class Abstract {
	
	
	public Abstract (int a) {
		System.out.println("constructor frpm Abstract");
	}
	
	
public void loginpage() {
	System.out.println("login method from abstract");
}public void homepage() {
	System.out.println("homepage method from abstract");
}
public void requestpage() {
	System.out.println("requestpage method from abstract");
}abstract public void uploadpage();
abstract public void downloadpage();

}

