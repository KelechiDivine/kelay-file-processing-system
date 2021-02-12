import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    Database database;
    
    @BeforeEach
    void setUp() {
        database = new Database();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void databaseHasGoldMemberFilesCategory() {
        GoldMember[] goldMembers = database.getGoldMembers();
        assertNotNull(goldMembers);
        assertEquals(0, goldMembers.length);
    }

    @Test
    void databaseHasSilverMemberFilesCategory() {
        SilverMember[] silverMembers = database.getSilverMembers();
        assertNotNull(silverMembers);
        assertEquals(0, silverMembers.length);
    }

    @Test
    void databaseHasPlatinumMemberFilesCategory() {
        PlatinumMember[] platinumMembers = database.getPlatinumMembers();
        assertNotNull(platinumMembers);
        assertEquals(0, platinumMembers.length);
    }

    @Test
    void databaseHasFiles() {
        Member[] members = database.getMembers();
        assertNotNull(members);
        assertEquals(0, members.length);
    }

    @Test
    void databaseCan_addPlatinumMemberFiles() {
        database.addPlatinumMember(new PlatinumMember());
        assertEquals(1, database.getPlatinumMembers().length);
    }

    @Test
    void databaseCan_addGoldMemberFiles() {
        database.addGoldMember(new GoldMember());
        assertEquals(1, database.getGoldMembers().length);
    }

    @Test
    void databaseCan_addSilverMemberFiles() {
        database.addSilverMember(new SilverMember());
        assertEquals(1, database.getSilverMembers().length);
    }
}