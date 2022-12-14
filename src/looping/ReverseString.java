package looping;

public class ReverseString {
	
	// reverse String
	
	public static void main(String[] args) {
		
		String s="Ganesh";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
