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
    void testSum1() {
        assertEquals(2, runner.sum(1, 1));
    }
    @Test
    void testSum2() {
        assertEquals(0, runner.sum(1, -1));
    }
    @Test
    void testSum3() {
        assertEquals(-3, runner.sum(-1, -2));
    }
}
