import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SecondTest {

    @ParameterizedTest
    @ValueSource(strings = {"admin", "user", "guest"})
    void testLogin(String role) {
        System.out.println(role);
        assertNotNull(role);
        assertTrue(true);
        assertFalse(false);
        System.out.println(Thread.currentThread().getName() + " — " + "testLogin");
    }
}
