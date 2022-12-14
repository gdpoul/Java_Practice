package ObjectAndClass;

public class Demo {
	
	static int a=10;
	int b=20;
	
	
	public void add()
	{
		int sum=a+b;
		a++;
		System.out.println(sum);
	}
		
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		obj.add();
		System.out.println(a);

	 		
	}

}


















