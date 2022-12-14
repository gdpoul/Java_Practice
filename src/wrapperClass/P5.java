package wrapperClass;

public class P5 {
	public static void main(String[] args) {
		
		/* UnBoxing
		 * yyyValue() 
		 * this method is used to find primitive value for given wrapper class
		 */
		
        Integer I=new Integer(10);
        int i=I.intValue();
        System.out.println(i);
          
        Double D=new Double(15.5);
        double d = D.doubleValue();
        System.out.println(d);
        
        Character C=new Character('a');
        char c= C.charValue();
        System.out.println(c);
        
        Boolean B=new Boolean(true);
        boolean b = B.booleanValue();
        System.out.println(b);
	}

}
