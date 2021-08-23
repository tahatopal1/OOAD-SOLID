package section7_DesignPatterns.section52_abstractfactorymethod;

public class Oracle implements Database {

	@Override
	public String connect() {
		return "Connection Successfull with Oracle DB.";
	}

}
