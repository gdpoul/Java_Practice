package staticAndNonstatic;

public class Class2 {
	
	static 
	{
		System.out.println("Static block-1");
	}
	static 
	{
		System.out.println("Static block-2");
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		
	}
}
