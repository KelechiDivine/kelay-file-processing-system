public class FileProcessingSystem {
	
	private final Database database;
	
	public FileProcessingSystem(){
		database = new Database();
	}
	
	public Database getDatabase() {
		return database;
	}
}
