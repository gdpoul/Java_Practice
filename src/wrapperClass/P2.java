package wrapperClass;


public class P2 {
	
	public static void main(String[] args) {
	    
		// valueOf(String s)
		// to create wrapper class object for given primitives and String
		 
		Integer I=Integer.valueOf("10");
		Float F=Float.valueOf("10.5f");
		Boolean B=Boolean.valueOf("true");
		
		// all wrapper class methods Except Character class contains valueOf(String)
		
		Character C= Character.valueOf('c');
		
	}

}
