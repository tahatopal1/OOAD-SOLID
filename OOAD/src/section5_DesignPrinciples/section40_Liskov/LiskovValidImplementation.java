package section5_DesignPrinciples.section40_Liskov;


class Bird1 {
	public void info() {
		
	}
}

// This solves the problem and help us to implement LSP
class FlyingBird extends Bird1{
	public void fly() {
		
	}
}

class Spearrow1 extends FlyingBird{
	
}

class Ostrich1 extends Bird{
	
}

public class LiskovValidImplementation {

}
