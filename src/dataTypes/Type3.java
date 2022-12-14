package dataTypes;

public class Type3 {
	public static void main(String[] args) {
		
		// Narrowing
		
		float f=10.5f;
		int i=(int)f;
		System.out.println(i);
		
		long l=100;
		char c=(char)l;
		System.out.println(c);
		
		double d=3.33;
		byte b=(byte) d;
		System.out.println(b);
	}

}
