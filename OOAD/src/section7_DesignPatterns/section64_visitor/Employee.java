package section7_DesignPatterns.section64_visitor;

public class Employee implements Visitable {
	
	private String performanceStatus;
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getPerformanceStatus() {
		return performanceStatus;
	}
	public void setPerformanceStatus(String performanceStatus) {
		this.performanceStatus = performanceStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	
}
