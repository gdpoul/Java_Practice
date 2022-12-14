package wrapperClass;

public class P4 {
	
	public static void main(String[] args) {
		
		// Boxing: valueOf(primitive) is used Convert primitive datatype to Object Type
	   
		int i1=10;
		Integer I1 = Integer.valueOf(i1);
		System.out.println(I1);
		
		// autoBoxing
		
		int i2=20;
		Integer I2=i2;
		System.out.println(I2);
	}

}
