package section7_DesignPatterns.section52_abstractfactorymethod;

public class MySql implements Database{

	@Override
	public String connect() {
		return "Connection Successfull with MySQL DB.";
	}
	
}
