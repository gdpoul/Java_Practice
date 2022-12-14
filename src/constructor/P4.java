package constructor;

public class P4 {
	
	P4()
	{
		this(10);
		System.out.println("No Parametrized Constructor");
	}
	P4(int x)
	{
		x=20;
		System.out.println(x);
	}
	P4(char c)
	{
		this();
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		new P4();
	}

}
