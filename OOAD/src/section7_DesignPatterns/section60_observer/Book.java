package section7_DesignPatterns.section60_observer;

import java.util.ArrayList;

public class Book implements SubjectLibrary {

	private String name;
	private String type;
	private String author;
	private String inStock;
	private double price;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Book(String name, String type, String author, String inStock, double price) {
		this.name = name;
		this.type = type;
		this.author = author;
		this.inStock = inStock;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getInStock() {
		return inStock;
	}

	public void setInStock(String inStock) {
		this.inStock = inStock;
		System.out.println("Availability changed from sold out to back in stock \n");
		this.notifyObserver();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}



	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}



	@Override
	public void subscribeObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void unSubscribeObserver(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObserver() {
		System.out.println(this);
		for (Observer observer : observers) {
			observer.update(this.inStock);
		}
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", type=" + type + ", author=" + author + ", inStock=" + inStock + ", price="
				+ price + "]";
	}
	
	

}
