package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class L1 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();	
		System.out.println(list.add("java"));
		list.add("phython");
		list.add("java");
		list.add("html");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
