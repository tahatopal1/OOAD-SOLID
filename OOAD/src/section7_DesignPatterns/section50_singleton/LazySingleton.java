package section7_DesignPatterns.section50_singleton;

public class LazySingleton {
	
	// Creates the singleton instance only when we need it
	
	private static LazySingleton singleton;
	
	private LazySingleton() { }
	
	
	// To make it thread safety, you can make this method as 'syncronized'
	public static LazySingleton getInstance() {
		
		if (singleton == null) {
			return singleton = new LazySingleton();
		}
		
		return singleton;
		
	}
	
}
