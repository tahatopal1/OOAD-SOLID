package section7_DesignPatterns.section52_abstractfactorymethod;

public class Mongo implements Database {

	@Override
	public String connect() {
		return "Connection Successfull with Mongo DB.";
	}

}
