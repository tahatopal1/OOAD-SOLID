package section7_DesignPatterns.section61_state;

public class StateDesignPatternApplication {

	public static void main(String[] args) {
		
		// HR State
		Employee employee = new Employee("HR");
		employee.working();
		employee.authorities();
		
		// Manager State
		employee = new Employee("Manager");
		employee.working();
		employee.authorities();
		
	}

}
