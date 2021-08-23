package section7_DesignPatterns.section62_strategy;

public class StrategyDesignPatternApplication {

	public static void main(String[] args) {
		
		Context context = new Context();
		context.setCompressionStrategy(new CompressToRar());
		context.generateFile("Abc");
		
		context.setCompressionStrategy(new CompressToZip());
		context.generateFile("Abc");
		
	}

}
