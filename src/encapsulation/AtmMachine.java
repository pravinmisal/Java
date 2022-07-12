package encapsulation;

public class AtmMachine {
	
	public void balenq(int pin) {
		BankServer b = new BankServer();
		b.getbalance(pin);
		
	}
	public void withdrawl(int amount) {
		BankServer b = new BankServer();
		b.setbalance(amount);
	}
	
	
public static void main(String[] args) {
	//BankServer b = new BankServer();
//System.out.println(b.cust1balance); you cant call variable bcz variable isprivate
	//b.getbalance(1234);
	AtmMachine a = new AtmMachine();
	a.balenq(1234);
	a.withdrawl(2000);
}
}
	


