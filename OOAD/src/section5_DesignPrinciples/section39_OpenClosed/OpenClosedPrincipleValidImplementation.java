package section5_DesignPrinciples.section39_OpenClosed;

abstract class Shape{
	public abstract void calculateArea();
}

class Circle2 extends Shape{
	
	double radius;

	public Circle2(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area: " + (3.14 * Math.pow(this.radius, 2)));
	}
	
}

class Rectangle2 extends Shape{
	
	double height;
	double width;
	
	public Rectangle2(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area: " + (this.height * this.width));		
	}	
}

// We needed to calculate the area of triangle, and created a new Triangle class
class Triangle2 extends Shape{
	
	double base;
	double height;
	
	public Triangle2(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area: " + (0.5 * this.base * this.height));
	}
	
}

class AreaCalculator2{
	public void calculate(Shape shape) {
		shape.calculateArea();
	}
}

public class OpenClosedPrincipleValidImplementation {

	public static void main(String[] args) {
		AreaCalculator2 calculator = new AreaCalculator2();
		calculator.calculate(new Rectangle2(10, 20));
		calculator.calculate(new Circle2(10));
		calculator.calculate(new Triangle2(10, 20));
		
	}

}
