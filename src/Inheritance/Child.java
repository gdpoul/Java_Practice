package Inheritance;

public class Child extends Parent{
	
	int a=11;
	String name="Ganesh";
	
	public void add()
	{
		System.out.println("Child class Method");
	}
	
	public static void main(String[] args) {
		
		Child obj=new Child();
	    obj.demo();
	    obj.add();
	    System.out.println(obj.a);
	    System.out.println(obj.s);
		
	}
}
