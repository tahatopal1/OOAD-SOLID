package section7_DesignPatterns.section63_template;

public class TemplateDesignPatternApplication {

	public static void main(String[] args) {
		
		ProcessOrder processOrder = new Shop();
		processOrder.doShopping();
		
		System.out.println();
		
		processOrder = new FlipCart();
		processOrder.doShopping();
	}

}
