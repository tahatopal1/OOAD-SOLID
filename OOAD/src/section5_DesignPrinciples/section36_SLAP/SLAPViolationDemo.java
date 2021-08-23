package section5_DesignPrinciples.section36_SLAP;

public class SLAPViolationDemo {

	// This method violates the SLAP because it has multilevel abstraction (fetching and mailing)
	public void getDetailAndMail() {
		
		// Code to fetch details from database
		System.out.println("Fetching details from database...");
		
		// Code to email the user
		System.out.println("Mailing to the user...");
	}
}
