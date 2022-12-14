package string;

public class S2 {

	public static void main(String[] args) {

//		new Keyword Create Object in a heap area..
//		for every new keyword new object is created
		
		String s1=new String("Hello");
		String s2=new String("Hello");	
		System.out.println(s1==s2);
		
//		for Every 'Literal', Object is Created in SCP(String Constant Pool area).
//		If we try to create a Object of same literal it wont create new object,
//		instead of it will return the reference/address of previously created object.
		
		
		String s3="Hello";
		String s4="Hello";
		System.out.println(s3==s4);
	}
}
