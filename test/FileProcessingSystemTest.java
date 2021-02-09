import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingSystemTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void systemHasADatabase(){
		//given
		FileProcessingSystem fPS = new FileProcessingSystem();
		//when
		Database database = fPS.getDatabase();
		//assert
		assertNotNull(database);
	}
}