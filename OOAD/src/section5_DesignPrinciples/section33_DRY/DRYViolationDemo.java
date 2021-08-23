package section5_DesignPrinciples.section33_DRY;

public class DRYViolationDemo {
	
	// This example violates "Don't Repeat Yourself" principle
	
	public void washWhiteClotes() {
		System.out.println("Putting in white clothes.");
		// Filling water to washing machine, setting configuration
		// Draining out water
	}
	
	public void washColorfulClotes() {
		System.out.println("Putting in colorful clothes.");
		// Filling water to washing machine, setting configuration
		// Draining out water
	}
}
