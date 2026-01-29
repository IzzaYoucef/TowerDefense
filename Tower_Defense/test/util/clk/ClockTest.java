package util.clk;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    private Clock c1;


    @BeforeEach
    public void before() {
        this.c1 = new Clock(100);
    }
    
    @Test
    public void testGetTime() {
        assertEquals(c1.getTime(), 0);
    }

    @Test
    public void testGetTickValue() {
        assertEquals(c1.getTickValue(), 100);
    }

    @Test
    public void testTick() {
        c1.tick();
        assertEquals(c1.getTime(), c1.getTickValue());
    }

    @Test
    public void testResetTime() {
        c1.resetTime();
        assertEquals(c1.getTime(), 0);   
    }

    @Test
    public void testSetTickValue() {
        c1.setTickValue(150);
        c1.tick();
        assertEquals(c1.getTime(), c1.getTickValue());
    }
    
}