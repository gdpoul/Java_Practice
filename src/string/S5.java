package string;

public class S5 {
	public static void main(String[] args) {
		
//		important methods in String class
//		public char charAt(int index)
		
		String s="Ganesh";
		System.out.println(s.charAt(2));
		
//		public String concat(String s);
		
		String s2="Hello";
		s2=s2.concat("World");
	
		// s2=s2+"World";
		//s2+="World";
		System.out.println(s2);
		
//      public String replace(char old,char new);
		
		String s3="ababa";
		System.out.println(s3.replace('a', 'b'));
		
//		public String substring(int begin);
//		public String substring(int begin,int end); return begin to end-1
		String s4="abcdefg";
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(3, 6));
		
//      public int indexOf(char c);

		String s5="DELHI";
		System.out.println(s5.indexOf('L'));
		
//      public int lastIndexOf(char c);
		
		String s6="ababaaa";
		System.out.println(s6.lastIndexOf('a'));

//      public String trim(); it will remove blank spaces of
//		beginning of string and end of string not middle blank spaces
		
		String s7="  Hello World ";
		System.out.println(s7.trim().length());
	}

}
