package lcas.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
    App runner;
    
    @BeforeEach
    void setup() {
        runner = new App();
    }
    @Test
    void testSum() {
        assertEquals(2, runner.sum(1, 1));
    }
}
