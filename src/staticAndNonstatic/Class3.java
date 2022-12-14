package staticAndNonstatic;

// Non static 
public class Class3 {

	int a=10;
	String s="Hello";
	
	public void demo()
	{
		System.out.println("Demo Method");
	}
	public static void main(String[] args) {
		
		Class3 obj=new Class3();
		
		System.out.println(obj.a);
		System.out.println(obj.s);
		obj.demo();
		
	}
}
