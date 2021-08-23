package section7_DesignPatterns.section51_factorymethod;

public class FactoryDesignPatternApplication {

	public static void main(String[] args) {
		
		Database db = null;
		
		db = DatabaseFactory.getDatabase("RDBMS");
		System.out.println("Database: " + db.getClass().getSimpleName());
		System.out.println(db.connect());
		
		db = DatabaseFactory.getDatabase("DBMS");
		System.out.println("Database: " + db.getClass().getSimpleName());
		System.out.println(db.connect());
		
	}

}
