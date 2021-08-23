package section5_DesignPrinciples.section37_delegation;

interface TravelBooking{
	public void bookTicket();
}

class BookTicketByAgent implements TravelBooking{
	
	TravelBooking t;
	
	public BookTicketByAgent(TravelBooking t) {
		this.t = t;
	}

	@Override
	public void bookTicket() {
		t.bookTicket();
	}
}

class TrainTicket implements TravelBooking{
	@Override
	public void bookTicket() {
		System.out.println("Train ticket booked!");
	}
}

class PlaneTicket implements TravelBooking{
	@Override
	public void bookTicket() {
		System.out.println("Plane ticket booked!");
	}
}

public class DelegationDemo {
	public static void main(String[] args) {
		BookTicketByAgent agent = new BookTicketByAgent(new TrainTicket());
		agent.bookTicket();
		
		// Change it to another
		agent = new BookTicketByAgent(new PlaneTicket());
		agent.bookTicket();
	}
}
