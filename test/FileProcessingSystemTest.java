import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingSystemTest {
	
	FileProcessingSystem fps;
	File file;
	
	@BeforeEach
	void setUp() {
		fps = new FileProcessingSystem();
		file = new File();
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
	void databaseHasSilverMemberFilesCategory(){
		//when
		ArrayList<SilverMember> sms = fps.getDatabase().getSilverMembers();
		//assert
		assertNotNull(sms);
		assertEquals(0,sms.size());
	}

	@Test
	void databaseHasPlatinumMemberFilesCategory(){
		//when
		ArrayList<PlatinumMember> pms = fps.getDatabase().getPlatinumMembers();
		assertNotNull(pms);
		assertEquals(0, pms.size());
	}

	@Test
	void databaseHasFiles(){
		ArrayList<Member> members = fps.getDatabase().getMembers();
		assertNotNull(members);
		assertEquals(0, members.size());
	}

	@Test
	void file_has_anId() {
		assertNotEquals(0, file.getId());
	}

	@Test
	void file_has_pages() {
		assertNotNull(file.getPages());
	}

	@Test
	void page_canBe_addedToFile() {
		file.getPages().add(new Page());
		assertEquals(1, file.getPages().size());
	}

	@Test
	void page_canBe_writtenTo_Read_andUpdated() {
		Page page = new Page("Day 1", "Just dey lavish");
		assertEquals("Day 1", page.getHeading());
		assertEquals("Just dey lavish", page.getActivitiesOfTheDay());

		page.setHeading("Na Day 2 ooo");
		page.setActivitiesOfTheDay("Kasala burst");
		assertEquals("Na Day 2 ooo", page.getHeading());
		assertEquals("Kasala burst", page.getActivitiesOfTheDay());
	}

	@Test
	void page_canBe_Deleted() {
		Page page = new Page("Day 1", "Just dey lavish");
		file.getPages().add(page);
		file.removePage(page.getNumber());
		assertFalse(file.getPages().contains(page));
	}

}