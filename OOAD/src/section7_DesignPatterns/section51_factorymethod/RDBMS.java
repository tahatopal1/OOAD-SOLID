package section7_DesignPatterns.section51_factorymethod;

public class RDBMS implements Database {

	@Override
	public String connect() {
		return "Connection Successful to RDBMS";
	}

}
