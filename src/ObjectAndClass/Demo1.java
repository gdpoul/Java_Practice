package ObjectAndClass;

public class Demo1 {
	
	String s="Hello";
	
	public String print()
	{
		return s;
	}
	
	
	public void dummy(String str)
	{
		System.out.println(s+" "+str);
	}
	
	public static void main(String[] args) {
		
		Demo1 obj=new Demo1();	
		System.out.println(obj.print());
		
		obj.dummy("World");
	}

}
