package section7_DesignPatterns.section61_state;

public class HR implements EmployeeState {

	@Override
	public void work() {
		System.out.println("Work: Recruitment resources for organisation");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve leaves: NO, HR can't approve the leaves!");
	}

}
