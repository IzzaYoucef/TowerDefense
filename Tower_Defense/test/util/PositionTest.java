package util;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {
    private Position p1;
    private Position p1bis;
    private Position p2;


    @BeforeEach
    public void before() {
        this.p1 = new Position(5, 4);
        this.p1bis = new Position(5, 4);
        this.p2 = new Position(8, 1);
    }

    @Test
    public void testGetX() {
        assertEquals(5, this.p1.getX());
        assertEquals(8, this.p2.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(4, this.p1.getY());
        assertEquals(1, this.p2.getY());
    }

    @Test 
    public void testPositionEquals() {
        assertTrue(p1.equals(p1));
        assertFalse(p1.equals(p2));
        assertTrue(p1.equals(p1bis));
        assertFalse(p1.equals("Not a Position"));
        assertFalse(p1.equals(null));
    }

    @Test
    public void testPositionToString() {
        assertEquals(p1.toString(), "(5,4)");
    }
}