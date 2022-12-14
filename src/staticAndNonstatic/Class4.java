package staticAndNonstatic;

public class Class4 {
	
	Class4()
	{
		System.out.println("Constructor");
	}
	
	// non static block
	{
		System.out.println("Non static block");
	}
	
	public static void main(String[] args) {
		
		new Class4();
		
		
	}

}
