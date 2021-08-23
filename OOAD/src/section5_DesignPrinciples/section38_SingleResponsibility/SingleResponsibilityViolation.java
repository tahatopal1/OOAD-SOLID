package section5_DesignPrinciples.section38_SingleResponsibility;

class TaskScheduling{
	
	public String compute() {
		return "Computing data based on user input";
	}
	
	public String save() {
		return "Save the object to database";
	}
	
	public String sendNotification() {
		return "Send the notification to the user"; 
	}
}

class SchedulingApplication{
	TaskScheduling ts;

	public SchedulingApplication(TaskScheduling ts) {
		this.ts = ts;
	}
	
	public void schedule() {
		System.out.println(ts.compute());
		System.out.println(ts.save());
		System.out.println(ts.sendNotification());
	}
}

public class SingleResponsibilityViolation {
	public static void main(String[] args) {
		SchedulingApplication sa = new SchedulingApplication(new TaskScheduling());
		sa.schedule();
	}
}
