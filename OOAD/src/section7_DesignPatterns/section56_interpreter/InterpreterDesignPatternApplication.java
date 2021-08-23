package section7_DesignPatterns.section56_interpreter;

public class InterpreterDesignPatternApplication {
	public static void main(String[] args) {
		Evaluator eval = new Evaluator();
		System.out.println("Entering simulation in Postfix notation: (25 5 4 * -)");
		String expression = "25 5 4 * -";
		System.out.println(eval.parse(expression).interpret());
	}
}
