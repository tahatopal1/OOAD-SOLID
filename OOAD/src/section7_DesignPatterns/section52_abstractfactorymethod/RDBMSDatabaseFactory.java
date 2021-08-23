package section7_DesignPatterns.section52_abstractfactorymethod;

public class RDBMSDatabaseFactory extends DatabaseFactory {

	@Override
	public Database getDatabase(String type) {
		Database db = null;
		if ("Oracle".equalsIgnoreCase(type)) 
			db = new Oracle();
		else if("MySql".equalsIgnoreCase(type))
			db = new MySql();
		else
			db = new MySql();
		
		return db;
	}

}
