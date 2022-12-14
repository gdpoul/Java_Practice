package looping;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		int n=10;
		int temp=n; int temp1=temp; 
		int digit=0;
		int sum=0;
		
		while(temp>0)
		{
			digit++;
			temp=temp/10;
		}
		while(temp1>0)
		{
			int base=temp1%10;
			sum=(int) (sum+ Math.pow(base, digit));
			temp1=temp1/10;
		}
		
		if(sum==n)
		{
			System.out.println(n+" is Amstrong number");
		}
		else
		{
			System.out.println(n+" is not Amstrong number");
		}
	}

}
