package section3_OOP.section12_InterfaceandAbstractClasses;

public abstract class AbstractClassDemo {
	
	private String x = "10";
	public  String y = "20";
	static  String z = "30";
	
	
	public String getX() {
		return x;
	}



	public void setX(String x) {
		this.x = x;
	}



	public abstract void m1();
}
