package interfacess;

public class ServiceProvider implements Interface1{
	
	
	public void m1() 
	{
		System.out.println("implementation of m1 method");
	}
	
	public void m2() 
	{
		System.out.println("Implementation of m2 method");
	}
	
public static void main(String[] args) {
	
	Interface1 obj=new ServiceProvider();
	System.out.println(A);
	System.out.println(S);
	obj.m1();
	obj.m2();
	obj.m3();
	Interface1.m4();
	
}
}
