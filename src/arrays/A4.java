package arrays;

public class A4 {
	public static void main(String[] args) {
		
//		 two dimensional array creation
		
		int[][] a=new int[2][];
		a[0]=new int[2];
		a[1]=new int[3];
		
//		three dimensional array
		int[][][] x=new int[2][][];
		
		x[0]=new int[3][];
		x[0][0]=new int[1];
		x[0][1]=new int[2];
		x[0][2]=new int[3];
		
		x[1]=new int[2][2];
	}

}
