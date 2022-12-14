package abstarction;

public class ICICI extends Bank {

	public void intrestRate() {
		System.out.println("Intrest rate of HDFC is : 4%");
	}

	public static void main(String[] args) {

		Bank icici = new ICICI();
		icici.intrestRate();
		icici.moneyTransfer();
	}
}
