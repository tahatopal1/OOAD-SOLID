package section7_DesignPatterns.section62_strategy;

public class Context {
	
	private Strategy compressionStrategy;

	public void setCompressionStrategy(Strategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}
	
	public void generateFile(String file) {
		compressionStrategy.compressFile(file);
	}
}
