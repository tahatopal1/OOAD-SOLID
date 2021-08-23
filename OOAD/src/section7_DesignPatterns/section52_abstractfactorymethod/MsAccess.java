package section7_DesignPatterns.section52_abstractfactorymethod;

public class MsAccess implements Database{

	@Override
	public String connect() {
		return "Connection Successfull with MsAccess DB.";
	}
	
}
