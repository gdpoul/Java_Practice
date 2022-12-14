package polymorphism;

public class MethodOverloading {
	
	public void demo()
	{
		System.out.println("No argument Method");
	}
	
	public void demo(int a, String s)
	{
		System.out.println(s);
	}
	
	public int demo(String s,int a)
	{
		return a+10;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.demo();
		obj.demo(10, "Hello");
		System.out.println(obj.demo("Hello",20));
	}

}
