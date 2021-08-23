package section7_DesignPatterns.section52_abstractfactorymethod;

public abstract class DatabaseFactory {
	
	public abstract Database getDatabase(String type);
	
	public static DatabaseFactory createDatabaseFactory(String factoryType) {
		if ("RDBMS".equals(factoryType)) 
			return new RDBMSDatabaseFactory();
		else
			return new DBMSDatabaseFactory();
	}
}
