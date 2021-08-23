package section7_DesignPatterns.section48_prototype;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements Cloneable{
	
	private String shopName;
	private List<Coffee> coffeeTypes = new ArrayList<Coffee>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Coffee> getCoffeeTypes() {
		return coffeeTypes;
	}
	public void setCoffeeTypes(List<Coffee> coffeeTypes) {
		this.coffeeTypes = coffeeTypes;
	}
	
	@Override
	public String toString() {
		return "CoffeeShop [shopName=" + shopName + ", coffeeTypes=" + coffeeTypes + "]";
	}
	
	public void loadStock() {
		for (int i = 0; i < 2; i++) {
			Coffee c = new Coffee();
			c.setCoffeeId(i);
			c.setCoffeeName("CoffeeName " + i);
			getCoffeeTypes().add(c);
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
