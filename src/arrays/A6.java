package arrays;
public class A6 {
	public static void main(String[] args) {

		int[] a= {1,2,3,4,5,6,7,8,9,10};
		sum(a);
		
	}

	public static void sum(int i[])
	{
		int total=0;
		for(int sum:i) 
		{
			total +=sum;
		}
		
		System.out.println("total sum of Array is: "+total);
	}
}
