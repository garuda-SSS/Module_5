import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class secondTest {

    @ParameterizedTest
    @ValueSource(strings = {"admin", "user", "guest"})
    void testLogin(String role) {
        System.out.println(role);
        assertNotNull(role);
        assertTrue(true);
        assertFalse(false);
    }
}
