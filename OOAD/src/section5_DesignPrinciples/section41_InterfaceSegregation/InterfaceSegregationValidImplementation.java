package section5_DesignPrinciples.section41_InterfaceSegregation;

interface Work{
	void work();
}

interface Sleep{
	void sleep();
}

class Human1 implements Work, Sleep{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
}

// Robot class only implements the Work interface since it doesn't have to have a sleeping implementation
class Robot1 implements Work{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceSegregationValidImplementation {

}
