package section7_DesignPatterns.section56_interpreter;

public abstract class Expression {
	public abstract int interpret();
}

// Terminal expression
class Number extends Expression{

	protected int value = 0;
	
	public Number(int value) {
		super();
		this.value = value;
	}

 	@Override
	public int interpret() {
		return value;
	}
	
}

// Non-terminal expressions
class Add extends Expression{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Add(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret() + rhs.interpret();
	}
	
}

class Subtract extends Expression{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Subtract(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret() - rhs.interpret();
	}
	
}

class Multiply extends Expression{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Multiply(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret() * rhs.interpret();
	}
	
}

class Divide extends Expression{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Divide(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret() / rhs.interpret();
	}
	
}