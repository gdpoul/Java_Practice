package string;

public class S6 {
	public static void main(String[] args) {
		
		String str=" ";
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
           
		String s="GANESH POUL";
		int ln=s.trim().length();
		System.out.println(ln);
	}

}
