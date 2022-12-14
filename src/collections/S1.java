package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S1 {
	
	public static void main(String[] args) {
		
		
		Set s=new HashSet();
		
		s.add("studen1");
		s.add(10);
		s.add(10.5f);
		s.add('a');
		s.add(true);
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
