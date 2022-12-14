package staticAndNonstatic;

public class Class5 {
	
	{
		System.out.println("Ns block-1");
	}
	
	{
		System.out.println("Ns Block-2");
	}
	Class5()
	{
		this(10,20);
		System.out.println("non parameterzied");
	}
	
	
	Class5(int a,  int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		new Class5();
	}
	{
		System.out.println("Ns Block-3");
	}

}
