package section7_DesignPatterns.section52_abstractfactorymethod;

public class AbstractFactoryDesignApplication {
	public static void main(String[] args) {
		
		DatabaseFactory dFactory = null;
		Database db = null;
		
		dFactory = DatabaseFactory.createDatabaseFactory("RDBMS");
		db = dFactory.getDatabase("MySql");
		System.out.println(db.connect());
		
		db = dFactory.getDatabase("Oracle");
		System.out.println(db.connect());
		
		dFactory = DatabaseFactory.createDatabaseFactory("DBMS");
		db = dFactory.getDatabase("MsAccess");
		System.out.println(db.connect());
		
	}
}
