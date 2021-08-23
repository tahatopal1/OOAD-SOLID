package section7_DesignPatterns.section60_observer;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDesignPatterApplication {

	public static void main(String[] args) {
		Book book = new Book("Goosebumps", "Horror", "Xyz", "Sold Out", 200);
		Observer user1 = new EndUser("Bob", book);
		Observer user2 = new EndUser("Tom", book);
		
		ArrayList<Observer> subscriber = book.getObservers();
		for (Iterator iterator = subscriber.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();
			EndUser eu = (EndUser) iterator.next();
			System.out.println(eu + "has subscriber for " + book.getName() + " Book");
			
			System.out.println(book.getInStock());
			
			System.out.println("Book is not available!");
			book.setInStock("Back in stock");
		}
	}

}

