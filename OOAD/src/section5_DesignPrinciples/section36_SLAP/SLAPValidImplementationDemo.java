package section5_DesignPrinciples.section36_SLAP;

public class SLAPValidImplementationDemo {
	
	public void getDetailsAndMail() {
		
		// Code to fetch details from database
		System.out.println("Fetching details from database...");
		String details = "Details...";
		
		emailTheUser(details);
	}

	private void emailTheUser(String details) {
		// Code to email the user
		System.out.println("Mailing to the user");
	}
}
