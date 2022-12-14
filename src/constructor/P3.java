package constructor;

public class P3 {
	int x=10;
	
	P3()
	{
		System.out.println(x);
	}
	
	public void sum(int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
	    P3 obj=new P3();
	    obj.sum(50);
	}

}
