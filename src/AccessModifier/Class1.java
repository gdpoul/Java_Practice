package AccessModifier;

class Class1 {
	private int i=10;
	private void demo()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) {
		Class1 obj=new Class1();
		System.out.println(obj.i);
		obj.demo();
	}
	
}
class PrivateModifier{
	
	public static void main(String[] args) {
		Class1 obj=new Class1();
		
		
	}
}
