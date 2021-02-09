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
		ArrayList<GoldMember> gms = fps.getDatabase().getGoldMembers();
		//assert
		assertNotNull(gms);
		assertEquals(0, gms.size());
	}

	@Test
	void silverMemberFileShouldBeInDataBase(){
		//when
		ArrayList<SilverMember> sms = fps.getDatabase().getSilverMembers();
		//assert
		assertNotNull(sms);
		assertEquals(0,sms.size());
	}
	@Test
	void platinumMemberFileShouldBeInDatabase(){
		//when
		ArrayList<PlatinumMember> pms = fps.getDatabase().getPlatinumMembers();
		assertNotNull(pms);
		assertEquals(0, pms.size());
	}
}