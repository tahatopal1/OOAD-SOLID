package section7_DesignPatterns.section61_state;

public class Developer implements EmployeeState {

	@Override
	public void work() {
		System.out.println("Work: Have to complete the assigned by manager");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve leaves: Yes, developer can approve the leaves of trainee!");
	}

}
