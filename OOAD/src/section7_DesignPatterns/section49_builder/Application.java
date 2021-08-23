package section7_DesignPatterns.section49_builder;

public class Application {

	public static void main(String[] args) {
		Mobile m = Manufracturer.createCompleteObject();
		System.out.println(m);
	}

}
