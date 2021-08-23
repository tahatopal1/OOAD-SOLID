package section7_DesignPatterns.section50_singleton;

public class EagerSingletonApplication {

	public static void main(String[] args) {
		
		EagerSingleton es1 = EagerSingleton.getInstance();
		EagerSingleton es2 = EagerSingleton.getInstance();
		
		if (es1 == es2) {
			System.out.println("These two object are identical!");
		}
		
	}

}
