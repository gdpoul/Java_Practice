package wrapperClass;

public class P3 {
	public static void main(String[] args) {

		/*
		 * Use valueOf() to create wrapper class object because it wont create new
		 * object every time,insted of it will search for excitng object it is present
		 * or not
		 */

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		System.out.println(i1 == i2);

		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf(10);

		System.out.println(i3 == i4);
	}

}
