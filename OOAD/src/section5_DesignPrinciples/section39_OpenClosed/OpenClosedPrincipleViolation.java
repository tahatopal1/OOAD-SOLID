package section5_DesignPrinciples.section39_OpenClosed;

class Circle{
	
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
}

class Rectangle{
	
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}	
}

// We needed to calculate the area of triangle, and created a new Triangle class
class Triangle{
	
	double base;
	double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}

class AreaCalculator{
	Object shape;
	
	

	public AreaCalculator(Object shape) {
		super();
		this.shape = shape;
	}



	public void calculate() {
		if (shape instanceof Rectangle) {
			Rectangle r = (Rectangle) shape;
			System.out.println("Area: " + (r.height * r.width));
		}
		
		if (shape instanceof Circle) {
			Circle c = (Circle) shape;
			System.out.println("Area: " + (3.14 * Math.pow(c.radius, 2)));
		}
		
		// After we created triangle class, we modify the calculation method
		//  to make this method able to calculate the area of rectangle
		
		if (shape instanceof Triangle) {
			Triangle t = (Triangle) shape;
			System.out.println("Area: " + (0.5 * t.base * t.height));
		}
		
		// So this is a violation of open/closed principle
		//  because we change the method and make it have a new shape

	}
	
}

public class OpenClosedPrincipleViolation {
	public static void main(String[] args) {
		AreaCalculator cal = new AreaCalculator(new Rectangle(20, 10));
		cal.calculate();
	}
}
