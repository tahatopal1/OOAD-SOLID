package section7_DesignPatterns.section50_singleton;

public class EagerSingleton {
	
	private static final EagerSingleton eagerSingleton = new EagerSingleton();
	
	private EagerSingleton() {
		System.out.println("EagerSingleton object has been created!");
	}
	
	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}
	
}
