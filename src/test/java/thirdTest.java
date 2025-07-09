import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ThirdTest {
    @Test
    public void hello(){
        System.out.println("Hello");
        assertNotNull("object");
        System.out.println(Thread.currentThread().getName() + " — " + "thirdTest");
    }
}
