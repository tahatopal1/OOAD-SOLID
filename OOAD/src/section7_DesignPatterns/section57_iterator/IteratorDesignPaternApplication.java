package section7_DesignPatterns.section57_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDesignPaternApplication {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Tom");
		list.add("John");
		list.add("Rohn");
		list.add("Shiva");
		
		Iterator<String> itr = list.iterator();
		System.out.println("Concrete iterator we get is: " + itr.toString());
		
		Set<String> set = new HashSet<String>();
		set.add("Tom");
		set.add("John");
		set.add("Rohn");
		set.add("Shiva");
		
		Iterator<String> setItr = set.iterator();
		System.out.println("Another iterator we get is: " + setItr.toString());
		
		// Writing the entire list by using iterator
		while(itr.hasNext())
			System.out.println("Name: " + itr.next());
		System.out.println("*************");
		
		// Writing the entire list by using iterator
		while(setItr.hasNext())
			System.out.println("Name: " + setItr.next());
		
		// Iterators will work according the adding manner of different collections
			// That's why the elements will be printed in different orders!!
	}
}
