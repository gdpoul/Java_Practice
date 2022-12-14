package encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer(5000);
		
		//get Customer balance
	
		System.out.println("Current Balance is :"+cust1.getBalance());
		
		// add fund transfer
		cust1.setBalance(2000);
		
		// updated balance
		
		System.out.println("updated balance is :"+cust1.getBalance());
	}

}
