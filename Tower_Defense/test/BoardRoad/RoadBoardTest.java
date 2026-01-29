package BoardRoad;

import Cell.Cell;
import Road.Road;
import Boards.RoadBoard;
import util.Position;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class RoadBoardTest {

    private RoadBoard roadBoard;

    @BeforeEach
    public void grille5x5() {
        roadBoard = new RoadBoard(5, 5, new Road()); // Plateau 5x5 qu'on utilisera pour toutes nos fonctions de test.
    }

    @Test
    // Au début le plateau ne contient que des cellules normales.
    public void testGrilleQueDesCellulesNormales() {
        roadBoard.initBoard();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertFalse(roadBoard.getCell(new Position(i,j)).isCellPath()); // Toutes les cellules de la grille 5x5 sont "normales"
            }
        }
    }

    @Test
    // On met des cellules chemin à notre grille.
    public void testGrilleAvecDesCellulesChemin() {
        Road road = new Road();
        road.addPosition(new Position(0, 0));
        road.addPosition(new Position(1, 1)); // On pourrait en mettre +

        roadBoard = new RoadBoard(5,5, road);
        roadBoard.initBoard();

        // Vérifier les cellules du chemin
        assertTrue(roadBoard.getCell(new Position(0,0)).isCellPath());
        assertTrue(roadBoard.getCell(new Position(1,1)).isCellPath());
    }

}