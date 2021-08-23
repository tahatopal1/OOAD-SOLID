package section7_DesignPatterns.section61_state;

public class Manager implements EmployeeState {

	@Override
	public void work() {
		System.out.println("Work: Design the project architecture");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve leaves: Yes, manager can approve leaves");
	}

}
