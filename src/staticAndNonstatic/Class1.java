package staticAndNonstatic;

// static 
public class Class1 {
	
	static int a;
	static int b=20;
	public static void demo()
	{
		System.out.println("Demo Method");
	}
	
	public static String abc(String s1, String s2)
	
	{
	          return s1+s2;	
		
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		demo();
		Class1.demo();
		System.out.println("----------------------------");
		System.out.println( abc("Hello","World"));
		
		
	}

}
