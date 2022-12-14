package polymorphism;

public class Coffee {
	static int Cappuccino=50,BlackCoffee=60,HotChocolate=55;
	 int milk= 20;
	int sugar=5;
	
	public void selectCoffee(String CoffeeType)
	{
		if(CoffeeType.equals("Cappuccino"))
		{
			System.out.println("Cappuccino is ready.. Please Take it...!");
		}
		else if(CoffeeType.equals("BlackCoffee"))
		{
			System.out.println("BlackCoffee is ready.. Please Take it...!");

		}
		else if(CoffeeType.equals("HotChocolate"))
		{
			System.out.println("HotChocolate is ready.. Please Take it...!");
		}
		else
		{
			System.out.println("Sorry This Coffee is Not Avaliable");
		}
	}
	public void totalPrice(int c)
	{
		System.out.println("Total Price of Coffee is:"+c);
	}
	public void totalPrice(int c,int s,int m)
	{
		int total=c+s+m;
		
		System.out.println("Total price is Coffee + milk + sugar is :"+total);
	}
}
