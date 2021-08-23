package section7_DesignPatterns.section70_facade;

class TravelFacade{
	FlightBooking flightBooking;
	HotelBooking  hotelBooking;
	TrainBooking  trainBooking;
	
	public TravelFacade() {
		flightBooking = new FlightBooking();
		hotelBooking  = new HotelBooking();
		trainBooking  = new TrainBooking();
	}
	
	enum BookingType{
		Flight, Train, Hotel, Flight_and_Hotel, Train_and_Hotel
	}
	
	public void book(BookingType bookingType, String name){
		switch(bookingType) {
			case Flight:  flightBooking.bookFlight(name); return;
			
			case Train:   flightBooking.bookFlight(name); return;
			
			case Hotel:   flightBooking.bookFlight(name); return;
			
			case Flight_and_Hotel:  flightBooking.bookFlight(name);
									hotelBooking.bookHotel(name);
									return;
									
			case Train_and_Hotel:   trainBooking.bookTrain(name);
									hotelBooking.bookHotel(name);
									return;
		}
	}
}

class FlightBooking{
	public void bookFlight(String name) {
		System.out.println("Flight booked for " + name);
	}
}

class HotelBooking{
	public void bookHotel(String name) {
		System.out.println("Hotel booked for " + name);
	}
}

class TrainBooking{
	public void bookTrain(String name) {
		System.out.println("Train booked for " + name);
	}
}

public class FacadeDesignPatternApplication {

	public static void main(String[] args) {
		TravelFacade booking = new TravelFacade();
		booking.book(TravelFacade.BookingType.Flight_and_Hotel, "Marmaris");
	}

}
