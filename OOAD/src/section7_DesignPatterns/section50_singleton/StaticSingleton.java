package section7_DesignPatterns.section50_singleton;

public class StaticSingleton {
	
	private static StaticSingleton singleton;
	
	private StaticSingleton() { }
	
	static { // It's good to use a static block as we want to handle exceptions
		try {
			singleton = new StaticSingleton();
		} catch (Exception e) {
			System.out.println("Exception occured during creating singleton instance");
		}
	}
	
	public static StaticSingleton getInstance() {
		return singleton;
	}
	
}
