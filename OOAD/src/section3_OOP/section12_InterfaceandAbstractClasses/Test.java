package section3_OOP.section12_InterfaceandAbstractClasses;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("***** INTERFACE TESTING STARTED *****");
		ClassDemo classDemo = new ClassDemo();
		InterfaceDemo interfaceDemo = new ClassDemo();
		
		InterfaceDemo.m3();
		// ClassDemo.m3() cannot be reached
		
		System.out.println("Can reach? -> " + classDemo.a); // Valid
		
		
		System.out.println(classDemo.m4());
		
		System.out.println("***** INTERFACE TESTING STOPPED *****");
		System.out.println("***** ABSTRACT CLASS TESTING STARTED *****");
		
		AbstractClassDemo abstractClassDemo = new Class2Demo();
		Class2Demo class2Demo = new Class2Demo();
		
		System.out.println(class2Demo.getX());
		System.out.println(class2Demo.y);
		System.out.println(class2Demo.z); // All valid
		
		System.out.println(Class2Demo.z); // Valid
		System.out.println(AbstractClassDemo.z); // Valid
		
		System.out.println("***** ABSTRACT CLASS TESTING STOPPED *****");
	}

}
