package section7_DesignPatterns.section51_factorymethod;

public class DBMS implements Database {

	@Override
	public String connect() {
		return "Connection Successful to DBMS";
	}

}
