package section7_DesignPatterns.section59_memento;

import java.util.ArrayList;
import java.util.List;

class Refrigerator{
	
	private int price;
	private int volume;
	private boolean isPowerSaver;
	
	public Refrigerator(int price, int volume, boolean isPowerSaver) {
		this.price = price;
		this.volume = volume;
		this.isPowerSaver = isPowerSaver;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPowerSaver() {
		return isPowerSaver;
	}

	public void setPowerSaver(boolean isPowerSaver) {
		this.isPowerSaver = isPowerSaver;
	}

	@Override
	public String toString() {
		return "Refrigerator [price=" + price + ", volume=" + volume + ", isPowerSaver=" + isPowerSaver + "]";
	}
	
}

class Memento{
	
	Refrigerator refrigerator;

	public Memento(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}

	public Refrigerator getRefrigerator() {
		return refrigerator;
	}

	public void setRefrigerator(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}

	@Override
	public String toString() {
		return "Memento [refrigerator=" + refrigerator + "]";
	}
	
}

class LivingAreaOriginator{
	
	Refrigerator refrigerator;

	public Refrigerator getRefrigerator() {
		return refrigerator;
	}

	public void setRefrigerator(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}
	
	public Memento createMemento() {
		return new Memento(this.refrigerator);
	}
	
	public void getMemento(Memento memento) {
		refrigerator = memento.getRefrigerator();
	}
}

class CareTakerStore{
	
	private List<Memento> mementos = new ArrayList<Memento>();

	public void addMemento(Memento memento) {
		this.mementos.add(memento);
	}
	
	public Memento getMemento(int index) {
		return mementos.get(index);
	}
	
	
}

public class MementoDesignPatternApplication {

	public static void main(String[] args) {
		
		 LivingAreaOriginator originator = new LivingAreaOriginator();
		 CareTakerStore careTaker = new CareTakerStore();
		 
		 originator.setRefrigerator(new Refrigerator(15000, 15, false));
		 careTaker.addMemento(originator.createMemento());
		 
		 originator.setRefrigerator(new Refrigerator(30000, 20, true));
		 careTaker.addMemento(originator.createMemento());
		 
		 // Current state of originator
		 System.out.println("Current state of originator: " + originator.getRefrigerator());
		 
		 // Restoring the old one
		 originator.getMemento(careTaker.getMemento(0));
		 System.out.println("Current state of originator, after restoring: " + originator.getRefrigerator());
	}

}
