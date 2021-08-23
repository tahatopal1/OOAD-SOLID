package section7_DesignPatterns.section48_prototype;

public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		CoffeeShop cs = new CoffeeShop();
		cs.setShopName("CCD");
		cs.loadStock();
		System.out.println(cs);
		
		// In this case, we still create new object. It will take time and be costly.
		CoffeeShop cs1 = new CoffeeShop();
		cs1.setShopName("CCD London");
		cs1.loadStock();
		
		// Let the prototype begins. We should use clone() method.
		CoffeeShop cs2 = (CoffeeShop) cs.clone();
		System.out.println(cs2);
		
		// When we remove one coffee type from cs object...
		cs.getCoffeeTypes().remove(0);
		System.out.println(cs.getCoffeeTypes());
		
		// The same coffee type will be removed as well. 
		// This means, we didn't create new object. (I mean the objects inside cloned objects, because cloned objects are not the same!!)
		 	//We just created two references for one object. (Shallow cloning)
		System.out.println(cs2.getCoffeeTypes());
		
				
	}

}
