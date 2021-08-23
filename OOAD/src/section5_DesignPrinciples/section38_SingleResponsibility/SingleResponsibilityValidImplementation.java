package section5_DesignPrinciples.section38_SingleResponsibility;


class Compute{
	public String compute() {
		return "Computing data based on user input";
	}
}

class Save{
	public String save() {
		return "Save the object to database";
	}
}

class Notification{
	public String sendNotification() {
		return "Send the notification to the user"; 
	}
}

class SchedulingApplication2{
	
	Compute c;
	Save s;
	Notification n;
	
	public SchedulingApplication2(Compute c, Save s, Notification n) {
		this.c = c;
		this.s = s;
		this.n = n;
	}
	
	public void schedule() {
		System.out.println(c.compute());
		System.out.println(s.save());
		System.out.println(n.sendNotification());
	}
	
	
}


public class SingleResponsibilityValidImplementation {
	public static void main(String[] args) {
		SchedulingApplication2 application = new SchedulingApplication2(new Compute(), new Save(), new Notification());
		application.schedule();
	}
}
