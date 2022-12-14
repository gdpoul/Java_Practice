package wrapperClass;

public class P6 {
	public static void main(String[] args) {
		
		/*  parseYyy():
		 *  it is used to find primitive value of the give String
		 *  Every Wrapper class except Character class contain parseYyy()
		 */
		
		String s=new String("10.5");
		float f = Float.parseFloat(s);
		System.out.println(f);
		
		
	}
}
