import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {

    File file;

    @BeforeEach
    void setUp() {
        file = new File();
    }

    @AfterEach
    void tearDown() {
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
        file.addPage(new Page());
        assertEquals(1, file.getNumberOfPages());
    }

    @Test
    void page_canBe_Deleted() {
        Page page = new Page();
        file.addPage(page);
        file.removePage(page.getNumber());
        assertFalse(file.hasPage(page));
    }
}