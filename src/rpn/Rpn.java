package rpn;

import java.util.Scanner;
import java.util.Stack;

public class Rpn {

	public void solution(String str[]) {
		
		Stack<String> st = new Stack<String>();
		float x, y, result;
		String s = "";
		String s1 = "";
		String s2;

		for (int i = 0; i < str.length; i++) 
		{
			
			if (str[i]!="+") 
			{
				st.push(str[i]);
				System.out.println(st);	 
			} 
			else {
				s = str[i];

				switch (s) {
				case "+": {
					x = Float.parseFloat(st.pop());
					y = Float.parseFloat(st.pop());
					result = x + y;
					s2 = s1 + result;
					st.push(s2);

					break;
				}
				case "-": {
					x = Float.parseFloat(st.pop());
					y = Float.parseFloat(st.pop());

					result = y - x;
					s2 = s1 + result;
					st.push(s2);
					break;
				}
				case "*": {
					x = Float.parseFloat(st.pop());
					y = Float.parseFloat(st.pop());

					result = y * x;
					s2 = s1 + result;
					st.push(s2);
					break;
				}
				case "/": {
					x = Float.parseFloat(st.pop());
					y = Float.parseFloat(st.pop());

					result = y / x;
					s2 = s1 + result;
					st.push(s2);
					break;
				}
				case "^": {
					x = Float.parseFloat(st.pop());
					y = Float.parseFloat(st.pop());

					result = (int) Math.pow(y, x);
					s2 = s1 + result;
					st.push(s2);
					break;
				}
				case "%": {
					x = Float.parseFloat(st.pop());
					result=x/100;
					s2 = s1 + result;
					st.push(s2);
					break;
				}
				case "!": {
					x = Float.parseFloat(st.pop());
					result = 1;
					for (int j = 1; j <= x; j++) {
						result = result * j;
					}
					s2 = s1 + result;
					st.push(s2);
					break;
				}
				default: {
					break;
				}
				}
			}		
		}	
		System.out.println(st.pop());
	}

	public static void main(String[] args) {
		
//		String al[]= {"1","2","3","+","-"};
		
		
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter your size: "); 
		  int size = sc.nextInt(); 
	      String[] al =new String[size];
		  System.out.print("Enter the element :"); 
		  for(int i=0;i<size;i++) 
		  {
	     	  al[i]=sc.next(); 
		  }
		 
          Rpn obj=new Rpn();
         
		  obj.solution(al);

	}

}
