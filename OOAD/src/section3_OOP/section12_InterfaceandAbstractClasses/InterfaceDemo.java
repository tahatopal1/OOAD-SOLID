package section3_OOP.section12_InterfaceandAbstractClasses;

public interface InterfaceDemo {
	
	// Variables in interfaces are always public, static and final (eventhough we do not declare like that)
	public static final String a = "static content";
	
	public void m1(); // Standart unimplemented method
	
	public void m2(); // Standart unimplemented method
	
	// Static methods in interface can be called with the name
	static void m3() {
		System.out.println("This is static interface method!");
		m5();
	};

	// Ensures default functionality. Can be overrided.
	default int m4() {
		m6();
		return 0;
	}
	
	// Private methods can only be used inside the interface as helper methods for the other ones.
	
	// Private static method for helping static methods (only the static methods can be used inside another one.)
	private static void m5() {
		System.out.println("This is private static method!");
	}
	
	// Private method for helping
	private void m6() {
		System.out.println("This is private non-static method!");
	}

}
