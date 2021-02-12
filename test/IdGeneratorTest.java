import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    void id_can_beGenerated() {
        assertNotEquals(0, IdGenerator.generate());
    }

    @Test
    void generatedId_isUnique() {
        int idOne = IdGenerator.generate();
        int idTwo = IdGenerator.generate();
        int idThree = IdGenerator.generate();
        assertTrue(
                (idTwo != idOne) &&
                        (idThree != idTwo)
                );
    }

    @Test
    void generatedId_isAutoIncremented() {
        int idOne = IdGenerator.generate();
        int idTwo = IdGenerator.generate();
        int idThree = IdGenerator.generate();
        assertTrue(
                (idTwo - idOne == 1) &&
                        (idThree - idTwo == 1)
                );
    }

}