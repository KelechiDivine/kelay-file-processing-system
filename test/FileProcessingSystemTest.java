import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingSystemTest {

    FileProcessingSystem system;

    @BeforeEach
    void setUp() {
        system = new FileProcessingSystem();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void systemHasADatabase() {
        Database database = system.getDatabase();
        assertNotNull(database);
    }

}