import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingSystemTest {
	
	FileProcessingSystem fps;
	
	@BeforeEach
	void setUp() {
		fps = new FileProcessingSystem();
	}
	
	@AfterEach
	void tearDown() {
	}

	@Test
	void systemHasADatabase(){
		//given
		//when
		Database database = fps.getDatabase();
		//assert
		assertNotNull(database);
	}
	
	@Test
	void databaseHasGoldMemberFilesCategory(){
		//when
		ArrayList<Member> gms = fps.getDatabase().getGoldMembers();
		//assert
		assertNotNull(gms);
		assertEquals(0, gms.size());
	}
	@Test
	void silverMemberFileShouldBeInDataBase(){
		//when
		ArrayList<Member> slm = fps.getDatabase().getSilverMembers();
		//assert
		assertNotNull(slm);
		assertEquals(0,slm.size());
	}
	@Test
	void platinumMemberFileShouldBeInDatabase(){
		//when
		ArrayList<Member> plm = fps.getDatabase().getPlatinumMembers();
		assertNotNull(plm);
		assertEquals(0, plm.size());
	}
}