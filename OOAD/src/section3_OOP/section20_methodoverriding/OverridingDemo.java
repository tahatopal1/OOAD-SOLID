package section3_OOP.section20_methodoverriding;

class Vecihle{
	public void run() {
		System.out.println("Vecihle is running");
	}
}

class Car extends Vecihle{
	public void run() {
		System.out.println("Car is running");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		Vecihle v = new Vecihle();
		v.run();
		
		Car c = new Car();
		c.run();
		
		// Upcasting
		Vecihle car = new Car();
		car.run();
		
		// Downcasting
		Car car2 = (Car) car;
		car2.run();
	}
}
