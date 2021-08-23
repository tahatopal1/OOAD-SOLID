package section3_OOP.section17_association;

class House{
	private Kitchen kitchen;

	public House() {
		this.kitchen = new Kitchen();
		kitchen.setFood("Pizza");
	}
	
	public String getFood() {
		return this.kitchen.getFood();
	}
	
}

class Kitchen{
	private String food;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
}

public class Composition {
	public static void main(String[] args) {
		House house = new House();
		System.out.println(house.getFood());
	}
}
