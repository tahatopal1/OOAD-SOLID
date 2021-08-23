package section3_OOP.section12_InterfaceandAbstractClasses;

interface A{
	default void method() {
		System.out.println("Deneme A");
	}
}

interface B{
	default void method() {
		System.out.println("Deneme B");
	}
}

class C implements A, B{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		A.super.method();
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		C c = new C();
		c.method();
	}
}
