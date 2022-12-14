package constructor;

public class P5 {
	
	int a=10;
	char c='a';
	P5()
	{
		int b=20;
		b=b+1;
		System.out.println(a);
		a++;
		System.out.println(a);
		int a=20;
		char c='b';
		System.out.println(b);
		System.out.println(a+1);
		
	}
	public static void main(String[] args) {
		P5 obj = new P5();
		
		System.out.println(obj.c);
		System.out.println(obj.a);
		
		
	}

}
