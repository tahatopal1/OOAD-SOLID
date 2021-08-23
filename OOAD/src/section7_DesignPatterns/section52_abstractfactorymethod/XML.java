package section7_DesignPatterns.section52_abstractfactorymethod;

public class XML implements Database {

	@Override
	public String connect() {
		return "Connection Successfull with XML DB.";
	}

}
