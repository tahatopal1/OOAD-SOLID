package section7_DesignPatterns.section49_builder;

public abstract class MobileBuilder {
	
	Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public abstract void createMemory();
	
	public abstract void createBattery();
	
	public abstract void createWireless();
	
	public abstract void createScreen();
	
	public abstract void createMetalCase();
	
	public final Mobile buildMobile() {
		Mobile mob = new Mobile();
		
		setMobile(mob);
		
		// With that solution, we won't have to call all this methods seperately
		createMemory();
		createBattery();
		createWireless();
		createScreen();
		createMetalCase();
		
		return mob;
	}
	
}
