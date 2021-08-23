package section7_DesignPatterns.section63_template;

public abstract class ProcessOrder {
	
	abstract public void selectProduct();
	abstract public void makePayment();
	abstract public void deliver();
	
	// This is the template method. Methods above will run in sequence.
	public final void doShopping() {
		selectProduct();
		makePayment();
		deliver();
	}
	
}
