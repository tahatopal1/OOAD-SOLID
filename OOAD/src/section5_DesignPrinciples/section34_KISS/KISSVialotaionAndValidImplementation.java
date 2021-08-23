package section5_DesignPrinciples.section34_KISS;

public class KISSVialotaionAndValidImplementation {
	// Method that violates KISS principle
	// SO MANY STATEMENTS !!!
	private static String getMonth(int month) {
		switch (month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "Decemeber";
			default: throw new IllegalArgumentException("Month must be in range 1 to 12");
		}
	}
	
	// Valid implementation for KISS principle
	private static String getMonthName(int month) {
		if ((month < 1) || (month > 12)) {
			throw new IllegalArgumentException("Month must be in range 1 to 12");
		}else {
			String[] months = {"January", "February", "March", "April", "May", "June", "July",
									"August", "September", "October", "November", "December"};
			return months[month - 1];
		}
	}
	
}
	

