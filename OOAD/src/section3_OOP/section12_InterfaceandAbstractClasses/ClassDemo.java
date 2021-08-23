package section3_OOP.section12_InterfaceandAbstractClasses;

public class ClassDemo implements InterfaceDemo {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public int m4() { // Overrided default method
		return InterfaceDemo.super.m4();
	}

}
