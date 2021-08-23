package section5_DesignPrinciples.section40_Liskov;

class Bird {
	public void info() {
		
	}
	
	public void fly() {
		
	}
}

class Spearrow extends Bird{
	
}

class Ostrich extends Bird{
	
}

public class LiskovViolation {

	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
		ostrich.fly(); // Actually, ostrich can't fly. So it violates Liskov Substitution Principle
	}
	
}
