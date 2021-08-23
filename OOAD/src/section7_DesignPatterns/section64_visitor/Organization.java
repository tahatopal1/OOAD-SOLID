package section7_DesignPatterns.section64_visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Organization {

	static List<Employee> employees;
	
	static {
		employees = new ArrayList<Employee>();
		
		for (int i = 0; i < 5; i++) {
			Employee employee = new Employee("Employee " + i);
			employees.add(employee);
		}
	}
	
	public static void ratings() {
		Visitor visitor = new CEO("Mr. George");
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			((Employee) iterator.next()).accept(visitor);
		}
	}
	
}
