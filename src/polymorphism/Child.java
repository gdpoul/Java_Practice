package polymorphism;

public class Child extends Parent{
	
	public void demo()
	{
		System.out.println("child class method");
	}
	Child()
	{
		super();
	}
public static void main(String[] args) {
	
	Parent p=new Child();
	p.demo();
}
}
