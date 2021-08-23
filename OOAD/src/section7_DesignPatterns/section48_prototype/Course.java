package section7_DesignPatterns.section48_prototype;

import java.util.ArrayList;
import java.util.List;

public class Course implements Cloneable{
	
	private String courseName;
	private List<Lecturer> lecturers = new ArrayList<Lecturer>();
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Lecturer> getLecturers() {
		return lecturers;
	}
	public void setLecturers(List<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}
	
	public void loadLecturers() {
		for (int i = 0; i < 3; i++) {
			Lecturer lecturer = new Lecturer();
			lecturer.setName("Lecturer " + i);
			this.lecturers.add(lecturer);
		}
	}
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", lecturers=" + lecturers + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Course c = new Course();
		for(Lecturer l: this.getLecturers()) {
			c.getLecturers().add(l);
		}
		return c;
	}
	
}
