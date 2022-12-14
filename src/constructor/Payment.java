package constructor;

public class Payment {
	
	public static void main(String[] args) {
		
		int n=5000;
		
		if(n>0 && n<1000)
		{
			new PhonePay();
		}
		else if(n>=1000 && n<5000)
		{
			new AmazonPay();
		}
		else if(n>=5000)
		{
			new GPay();
		}
		
	}
}
