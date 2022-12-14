package abstarction;

public class HDFC extends Bank {

	public void intrestRate() {
		System.out.println("Intrest rate of HDFC is : 5%");
	}

	public static void main(String[] args) {

		Bank hdfc = new HDFC();
		hdfc.intrestRate();
		hdfc.moneyTransfer();
	}
}
