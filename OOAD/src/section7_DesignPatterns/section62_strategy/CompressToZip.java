package section7_DesignPatterns.section62_strategy;

public class CompressToZip implements Strategy {

	@Override
	public void compressFile(String file) {
		System.out.println(file + " has been successfully converted to .zip file");
	}

}
