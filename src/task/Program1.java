package task;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i <3 ; i++) {
			
			try
			{
				long n = sc.nextLong();
			  
			System.out.println("Can be fitted in: ");
			if (n >= -128 && n <= 127) {
				System.out.println("byte");
				System.out.println("short");
				System.out.println("int");
				System.out.println("long");
			}

			else if (n >= -32768 && n <= 32767) {
				System.out.println("short");
				System.out.println("int");
				System.out.println("long");
			}

			else if (n >= -2147483648 && n <= 2147483647) {
				System.out.println("int");
				System.out.println("long");
			}

			else if (n >= -9223372036854775808l && n <= 9223372036854775807l) {
				System.out.println("long");
			}
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere");
			}

		}
		

	}

}
