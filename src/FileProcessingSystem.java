public class FileProcessingSystem {
	
	private Database database;
	
	public FileProcessingSystem(){
		database = new Database();
	}
	
	public Database getDatabase() {
		return database;
	}
}
