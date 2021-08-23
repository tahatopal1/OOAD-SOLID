package section7_DesignPatterns.section49_builder;

public class MobileBuilderImpl extends MobileBuilder {
	
	@Override
	public void createMemory() {
		getMobile().setMemory("32 GB");
		System.out.println("Memory created and installed!");
	}

	@Override
	public void createBattery() {
		getMobile().setBattery("4500 mAh");
		System.out.println("Battery created and installed!");
	}

	@Override
	public void createWireless() {
		getMobile().setWireless("Bluetooth and Wi-Fi");
		System.out.println("Wireless created and installed!");
	}

	@Override
	public void createScreen() {
		getMobile().setScreen("Amoled");
		System.out.println("Screen created and installed!");
	}

	@Override
	public void createMetalCase() {
		getMobile().setMetalCase("Aluminium");
		System.out.println("Metal case created and installed!");
	}

}
