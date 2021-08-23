package section3_OOP.section17_association;

import java.util.ArrayList;
import java.util.List;

class College{
	
	private String name;
	private List<Teacher> teachers;
	
	public College(String name, List<Teacher> teachers) {
		super();
		this.name = name;
		this.teachers = teachers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}

class Teacher{ 
	
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	
}

public class AggregationDemo {
	public static void main(String[] args) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("Rohn", "Java"));
		teachers.add(new Teacher("John", "Phyton"));
		
		College college = new College("My College", teachers);
		System.out.println(college);
	}
}
