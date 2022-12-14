package looping;

public class ReverseNumber {
	public static void main(String[] args) {
		
		// reverse the Number
		
		int n=123;
		int temp=0;
		
		while(n>0)
		{
			int r = n%10;
			temp=r+(temp*10);
			n=n/10;
		}
		System.out.println(temp);
	}

}
