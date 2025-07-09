import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    @BeforeAll
    public static void begin(){
        System.out.println("Начало тестового прогона");
        assertTrue(2==2);
    }
    @AfterAll
    public static void end(){
        System.out.println("Конец тестового прогона");
        assertFalse(2==3);
    }
    @BeforeEach
    void beginTest(TestInfo testInfo) {
        String testName = testInfo.getDisplayName();
        System.out.println("Начало теста: " + testName);
        assertNotNull("object");
    }
    @AfterEach
    void endTest(TestInfo testInfo) {
        String testName = testInfo.getDisplayName();
        System.out.println("Конец теста: " + testName);
        assertNotNull("object");
    }
    @Test
    public void justSmth(){
        assertEquals(5, 5);
        System.out.println(Thread.currentThread().getName() + " — " + "justSmth");
    }
}
