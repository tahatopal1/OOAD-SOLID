package section7_DesignPatterns.section62_strategy;

public class CompressToRar implements Strategy {

	@Override
	public void compressFile(String file) {
		System.out.println(file + " has been successfully converted to .rar file");
	}

}
