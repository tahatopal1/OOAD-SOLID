package section5_DesignPrinciples.section33_DRY;

public class DRYImplementationDemo {
	
	// This example is a valid implementation for "Don't Repeat Yourself" principle
	
	public void washWhiteClotes() {
		System.out.println("Putting in white clothes.");
		this.performCommonTasksForLaundry();
	}
	
	public void washColorfulClotes() {
		System.out.println("Putting in colorful clothes.");
		this.performCommonTasksForLaundry(); 
	}
	
	public void performCommonTasksForLaundry(){
		// Filling water to washing machine, setting configuration
		// Draining out water
	}
}
