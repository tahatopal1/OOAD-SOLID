package section7_DesignPatterns.section48_prototype;

public class Coffee {
	
	private int coffeeId;
	private String coffeeName;
	
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	@Override
	public String toString() {
		return "Coffee [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + "]";
	}
	
	
}
