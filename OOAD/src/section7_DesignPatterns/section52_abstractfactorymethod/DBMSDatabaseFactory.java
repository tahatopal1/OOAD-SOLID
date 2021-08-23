package section7_DesignPatterns.section52_abstractfactorymethod;

public class DBMSDatabaseFactory extends DatabaseFactory {

	@Override
	public Database getDatabase(String type) {
		Database db = null;
		if ("MsAccess".equalsIgnoreCase(type)) 
			db = new MsAccess();
		else if("XML".equalsIgnoreCase(type))
			db = new XML();
		else if("Mongo".equalsIgnoreCase(type))
			db = new Mongo();
		else db = new XML();
		
		return db;
		
	}

}
