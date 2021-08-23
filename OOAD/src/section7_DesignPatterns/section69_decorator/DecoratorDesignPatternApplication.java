package section7_DesignPatterns.section69_decorator;

interface Burger{
	public void makeBurger();
}

class PlainBurger implements Burger{
	@Override
	public void makeBurger() {
		System.out.println("Plain burger is ready.");
	}
}

abstract class BurgerDecorator extends PlainBurger{
	protected Burger burger;

	public BurgerDecorator(Burger burger) {
		this.burger = burger;
	}
	
	public void makeBurger() {
		burger.makeBurger();
	}
	
}

class CheeseBurgerDecorator extends BurgerDecorator{

	public CheeseBurgerDecorator(Burger burger) {
		super(burger);
	}
	
	public void makeBurger() {
		burger.makeBurger();
		System.out.println(", cheese added.");
	}
	
}

class BBQBurgerDecorator extends BurgerDecorator{

	public BBQBurgerDecorator(Burger burger) {
		super(burger);
	}
	
	public void makeBurger(){
		burger.makeBurger();
		System.out.println(", bbq sauce added.");
	}
	
}

public class DecoratorDesignPatternApplication {
	public static void main(String[] args) {
		
		// Making plain burger
		Burger burger = new PlainBurger();
		burger.makeBurger();
		
		// Making cheeseburger
		new CheeseBurgerDecorator(burger).makeBurger();
		
		// Making BBQ burger
		new BBQBurgerDecorator(burger).makeBurger();
		
	}
}
