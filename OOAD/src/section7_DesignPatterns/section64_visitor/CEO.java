package section7_DesignPatterns.section64_visitor;

public class CEO implements Visitor {
	
	private String name;
	
	public CEO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void visit(Visitable vis) {
		
		Employee employee = (Employee) vis;
		employee.setPerformanceStatus("Good");
		System.out.println("This is to certify that " 
									+ employee.getName() 
									+ " performed " 
									+ employee.getPerformanceStatus()
									+ "in his quarter year. This rating has been given by CEO " 
									+ this.getName());
	}
	
	
}
