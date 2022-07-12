package encapsulation;

public class BankServer {
private int cust1balance = 7000;
	
	public void getbalance(int pin) {
		if (pin==1234) {
			System.out.println("your balance is :"+cust1balance);
		}
		else {
			System.out.println("please check your pin and try again");
		}
	}public void setbalance(int amount) {
		if(amount<=cust1balance) {
			cust1balance=cust1balance-amount;
System.out.println("amount"+amount+"has been withdrawl your balance is: "+cust1balance);
		}
	}
	
	
	
}
