package encapsulation;

public class Customer {
	
	private double balance;
	
	Customer(double bal)
	{
		this.balance=bal;
	}
	public double getBalance()
	{
		// validation
		return balance;
	}
    public void setBalance(double add)
    {
    	//add fund transfer
    	this.balance=balance+add;
    	
    	
    }
}
