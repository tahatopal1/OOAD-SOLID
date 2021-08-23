package section7_DesignPatterns.section50_singleton;

public class InnerStaticSingleton {
	
	// A way to protect thread safety
	
	private InnerStaticSingleton() {}
	
	private static class Singleton{
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}
	
	public InnerStaticSingleton getInstance() {
		return Singleton.INSTANCE;
	}
	
}
