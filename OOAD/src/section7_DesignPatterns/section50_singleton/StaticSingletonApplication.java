package section7_DesignPatterns.section50_singleton;

public class StaticSingletonApplication {

	public static void main(String[] args) {
		
		StaticSingleton ss = StaticSingleton.getInstance();
		StaticSingleton ss1 = StaticSingleton.getInstance();
		
		if (ss == ss1) {
			System.out.println("These two object are identical!");
		}
		
	}

}
