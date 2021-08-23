package section7_DesignPatterns.section63_template;

public class FlipCart extends ProcessOrder {

	@Override
	public void selectProduct() {
		System.out.println("----- Online Shopping -----");
		System.out.println("Search for the relative product.");
		System.out.println("Add to cart");
		System.out.println("Checkout");
	}

	@Override
	public void makePayment() {
		System.out.println("Add address details.");
		System.out.println("Select the mode of payment.");
		System.out.println("Make payment");
	}

	@Override
	public void deliver() {
		System.out.println("Your product will be delivered in 3-4 working days");
		System.out.println("Continue Shopping.");
		System.out.println("--------------------------");
	}

}
