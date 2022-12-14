package wrapperClass;

public class P7 {
	public static void main(String[] args) {
		
		/* toString():
		 *  to find String for the given primitive value or wrapper 
		 *  object whenever we are trying to print wrapper class object reference
		 * internally this toString() will be called..
		 */
		
		Integer I=Integer.valueOf(10);
		String s=I.toString();
		System.out.println(s);
		System.out.println(I);
		System.out.println(I.toString());
		
	}

}
