package section7_DesignPatterns.section49_builder;

public class Manufracturer {
	
	public static Mobile createCompleteObject() {
		MobileBuilder mobileBuilder = new MobileBuilderImpl();
		return mobileBuilder.buildMobile();
	}
}
