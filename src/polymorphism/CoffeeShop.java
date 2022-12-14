package polymorphism;

import java.util.Scanner;

public class CoffeeShop extends Coffee {

	public static void main(String[] args) {
		CoffeeShop obj = new CoffeeShop();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Coffee name given Below:");
		System.out.println("Cappuccino\tBlackCoffee\tHotChocolate");
		String selectCoffeeType = sc.nextLine();

		System.out.println("Do you want to add milk and Sugar");
		String status = sc.nextLine();

		if (status.equals("yes")) {
			obj.selectCoffee(selectCoffeeType);
			if (selectCoffeeType.equals("Cappuccino")) {
				obj.totalPrice(Cappuccino, obj.milk, obj.sugar);
			} else if (selectCoffeeType.equals("BlackCoffee")) {
				obj.totalPrice(BlackCoffee, obj.milk, obj.sugar);
			} else if (selectCoffeeType.equals("HotChocolate")) {
				obj.totalPrice(HotChocolate, obj.milk, obj.sugar);
			}
		} else {
			obj.selectCoffee(selectCoffeeType);
			if (selectCoffeeType.equals("Cappuccino")) {
				obj.totalPrice(Cappuccino);
			} else if (selectCoffeeType.equals("BlackCoffee")) {
				obj.totalPrice(BlackCoffee);

			} else if (selectCoffeeType.equals("HotChocolate")) {
				obj.totalPrice(HotChocolate);
			}
		}

	}

}
