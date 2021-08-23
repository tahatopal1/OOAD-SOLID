package section7_DesignPatterns.section71_flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

class Product{
	
	private final String name;

	public Product(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name";
	}

}

class Order{
	
	private final int orderNumber;
	private final Product product;
	
	public Order(int orderNumber, Product product) {
		this.orderNumber = orderNumber;
		this.product = product;
	}
	
	public void processOrder() {
		System.out.println("Ordering " + this.product + " for order number "
				            + this.orderNumber);
	}
	
}

class Portfolio{
	
	private Map<String, Product> products = new HashMap<String, Product>();
	
	public Product lookUp(String product) {
		if (!products.containsKey(product)) 
			products.put(product, new Product(product));
		return products.get(product);
	}
	
	public int totalProductsMade() {
		return this.products.size();
	}
}

class Bucket{
	
	private final Portfolio portfolio = new Portfolio();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	public void executeOrder(String productName, int orderNumber) {
		Product product = portfolio.lookUp(productName);
		Order order = new Order(orderNumber, product);
		orders.add(order);
	}
	
	public void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	
	public int getTotalProducts() {
		return this.portfolio.totalProductsMade();
	}
	
}

public class FlyweigtDesignPatternApplication {

	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		bucket.executeOrder("Macbook Pro", 12);
		bucket.executeOrder("Samsung Mobile", 11);
		bucket.executeOrder("Smart TV", 7);
		bucket.executeOrder("Washing Machine", 5);
		bucket.executeOrder("Washing Machine", 13);
		bucket.process();
		System.out.println(bucket.getTotalProducts());
	}

}
