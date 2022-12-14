package string;

public class Sb1 {
	public static void main(String[] args) {
		
		// bydefault capacity of StringBuffer
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		sb.append("r");
		System.out.println(sb.capacity());
		
		// add StringBuffer Capacity
		
		StringBuffer sb1=new StringBuffer(100);
		System.out.println(sb1.capacity());
		
		
	}

}
