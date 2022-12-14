package dataTypes;

import java.util.Scanner;

public class Type1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		long n = sc.nextLong();

		System.out.println("Given Number Can be fitted in: ");
		if (n >= -128 && n <= 127) {
			System.out.println("byte");

			if (n >= -32768 && n <= 32767) {
				System.out.println("short");

				if (n >= -2147483648 && n <= 2147483647) {
					System.out.println("int");

					if (n >= -9223372036854775808l && n <= 9223372036854775807l) {
						System.out.println("long");
					}
				}
			}
		} else if (n >= -32768 && n <= 32767) {
			System.out.println("short");

			if (n >= -2147483648 && n <= 2147483647) {
				System.out.println("int");

				if (n >= -9223372036854775808l && n <= 9223372036854775807l) {
					System.out.println("long");
				}
			}
		} else if (n >= -2147483648 && n <= 2147483647) {
			System.out.println("int");

			if (n >= -9223372036854775808l && n <= 9223372036854775807l) {
				System.out.println("long");
			}
		} else if (n >= -9223372036854775808l && n <= 9223372036854775807l) {
			System.out.println("long");
		}
	}
}
