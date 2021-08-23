package section5_DesignPrinciples.section41_InterfaceSegregation;

interface Worker{
	void work();
	void sleep();
}

class Human implements Worker{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}

// Robots can't sleep, so sleep method won't be implemented.
// This situation violates 'Interface Segregation Principle'
class Robot implements Worker{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceSegregationViolation {

}
