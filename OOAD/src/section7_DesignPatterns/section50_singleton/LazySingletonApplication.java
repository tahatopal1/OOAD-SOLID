package section7_DesignPatterns.section50_singleton;

public class LazySingletonApplication {
	public static void main(String[] args) {
		
		LazySingleton ls = LazySingleton.getInstance();
		LazySingleton ls1 = LazySingleton.getInstance();
		
		if (ls == ls1) {
			System.out.println("These two object are identical!");
		}
		
	}
}
