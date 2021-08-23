package section7_DesignPatterns.section48_prototype;

public class PrototypeDesignPatternWithDeepClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course c = new Course();
		c.setCourseName("Programming");
		c.loadLecturers();
		System.out.println(c);
		
		Course c1 = (Course) c.clone();
		
		// When we remove an element from lecturer list of c object...
		c.getLecturers().remove(0);
		
		// Lecturer list of c1 won't be affected (Deep Clone)
		System.out.println(c.getLecturers());
		System.out.println(c1.getLecturers());
		
	}
}
