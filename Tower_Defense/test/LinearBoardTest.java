import Boards.LinearBoard;
import Cell.Cell;
import util.Position;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LinearBoardTest {
    @Test
    public void testInitBoardWorksPerfectly() {
        LinearBoard board = new LinearBoard(1, 1);

        assertTrue(
            board.getCell(new Position(0,0)) instanceof Cell);
    }
}
