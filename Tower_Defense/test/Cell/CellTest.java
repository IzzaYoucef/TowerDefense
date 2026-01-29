package Cell;

import Tower.Tower;
import util.Exception.NotAbleToPlaceTowerException;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    private Cell celluleNormale;
    private Cell celluleChemin;

    @BeforeEach
    public void avantChaqueTest() {
        this.celluleNormale = new Cell(2, 4, false); // Une cellule normale aux coordonnées (2,4)
        this.celluleChemin = new Cell(3, 6, true); // Une cellule chemin aux coordonnées (3,6)
    }

    @Test
    public void testPasDeBallonsAuDebut() {
        // Ni les cellules normales, ni les cellules chemins contiennent des ballons, NOUS devons les ajouter.
        assertTrue(celluleNormale.getBallons().isEmpty());
        assertTrue(celluleChemin.getBallons().isEmpty());
    }

    @Test
    public void testPasDeToursAuDebut() {
        // Ni les cellules normales, ni les cellules chemins contiennent des tours, NOUS devons les ajouter.
        assertTrue(celluleNormale.getTowers().isEmpty());
        assertTrue(celluleChemin.getTowers().isEmpty());
    }


    /*
     *    @Test
     *    public void testListeDesBallonsAugmente(){
     *        Ballon ballon = new Ballon();
     *    }
     *
     *   Ce test est à finir une fois qu'on entammera les ballons.
     */


    /*
     *    @Test
     *    public void testPasDeToursSurUneCelluleChemin() throws NotAbleToPlaceTowerException {
     *
     *    }
     *   Ce test aussi est à finir une fois qu'on entammera les tours.
     */


    @Test
    public void testEgaliteDeuxCellules() {
        Cell cellule1 = new Cell(2, 3, true);
        Cell cellule2 = new Cell(2, 3, true); // Les deux

        assertEquals(cellule1, cellule2);
    }

    @Test
    public void testInegaliteDeuxCellules() {
        Cell cellule1 = new Cell(2, 3, true);
        Cell cellule2 = new Cell(2, 3, false); // Ici cellule1 et cellule2 ont la même position mais pas le même type.

        assertNotEquals(cellule1, cellule2);

        Cell cellule3 = new Cell(2, 1, true);
        Cell cellule4 = new Cell(2, 5, true); // Ici cellule3 et cellule4 ont le même type, mais pas la même position.

        assertNotEquals(cellule3, cellule4);
    }
}