package string;

public class MaskTest {
	
	public static String mask(String creditCard)
	{
		String x="xxxx-xxxx-xxxx-";
		StringBuilder sb=new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		return sb.toString();
		//return x+creditCard.substring(15, 19);
	}
	
	public static void main(String[] args) {
		
		MaskTest obj=new MaskTest();
		System.out.println(obj.mask("1234-5678-9012-3456"));
		
		
	}

}
