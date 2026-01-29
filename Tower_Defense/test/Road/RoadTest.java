package Road;

import Road.Road;
import util.Position;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    private Road road;

    @BeforeEach
    public void avantChaqueTest() {
        road = new Road();
    }

    @Test
    public void testCheminVide() {
        assertTrue(road.path().isEmpty());     // Au début, un chemin ne contient aucune position
    }

    @Test
    public void testLaTailleDeLaListeAugmenteQuandOnAjouteUnePosition() {
        Position p = new Position(0, 0);
        road.addPosition(p);

        assertEquals(1, road.path().size());

        Position x = new Position(1,0);
        road.addPosition(x);

        assertEquals(2,road.path().size());

    }

    // ON POURRA AUSSI RAJOUTER L'ORDRE DES POSITIONS QUI COMPOSENT LE CHEMIN

    @Test
        // On ne peut pas ajouter la même position plusieurs fois
    void testAjouterMemePositionPlusieursFois() {
        Position p = new Position(0, 0);

        road.addPosition(p);
        road.addPosition(p);

        assertEquals(2, road.path().size());
    }

    @Test
        // La méthode path() retourne bien la liste des positions
    void testRecuperationListePositions() {
        Position p1 = new Position(2, 3);
        Position p2 = new Position(4, 5);

        road.addPosition(p1);
        road.addPosition(p2);

        assertNotNull(road.path());
        assertEquals(2, road.path().size());
    }
}