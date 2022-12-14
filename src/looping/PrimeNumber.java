
// write a program to check given number is prime or not
package looping;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		int r=0;
		for (int i = 1; i <= n; i++) 
		{
			if (n % i == 0) 
			{
				r++;
			}
		}
		if(r==2)
		{
			System.out.println(n+" is Prime Number");
		}
		else 
		{
			System.out.println(n+" is not Prime Number");
		}

	}

}
