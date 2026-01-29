import Boards.RoadBoard;
import Road.Road;
import util.Position;
import java.util.Random;

/**
 * Livrable 1a : Génère un plateau aléatoire avec un chemin aléatoire
 * partant du bord gauche.
 *
 * Usage: java Livrable1a.java <largeur> <hauteur>
 */
public class Livrable1a {

    /**
     * Génère un chemin aléatoire partant du bord gauche (x=0)
     * et se déplaçant vers la droite jusqu'à atteindre le bord droit.
     *
     * @param width of the board
     * @param height of the board
     * @return random road
     */
    private static Road generateRandomRoad(int width, int height) {
        Road road = new Road();
        Random random = new Random();

        // Position de départ : bord gauche (x=0) y osef
        int currentY = random.nextInt(height);
        int currentX = 0;

        road.addPosition(new Position(currentX, currentY));

        // Générer le chemin jusqu'au bord droit
        while (currentX < width - 1) {
            // Choix aléatoire de direction : droite, haut-droite, ou bas-droite
            int direction = random.nextInt(3);

            // Toujours avancer vers la droite
            currentX++;

            // Modifier Y selon la direction
            switch (direction) {
                case 0: // Droite (même ligne)
                    break;
                case 1: // Haut-droite
                    if (currentY > 0) {
                        currentY--;
                    }
                    break;
                case 2: // Bas-droite
                    if (currentY < height - 1) {
                        currentY++;
                    }
                    break;
            }

            road.addPosition(new Position(currentX, currentY));
        }

        return road;
    }

    /**
     * Affiche les coordonnées des cases du chemin.
     *
     * @param road le chemin à afficher
     */
    private static void displayRoadCoordinates(Road road) {
        System.out.println("=== Coordonnées du chemin ===");
        int index = 0;
        for (Position pos : road.path()) {
            System.out.println("Case " + index + " : (" + pos.getX() + ", " + pos.getY() + ")");
            index++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Vérifier les arguments
        if (args.length != 2) {
            System.out.println("Usage: java Livrable1a <largeur> <hauteur>");
        }

        try {
            // Récupérer les dimensions
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            // Valider les dimensions
            if (width <= 0 || height <= 0) {
                System.out.println("Erreur: La largeur et la hauteur doivent être positives.");
            }

            // Générer un chemin aléatoire
            Road road = generateRandomRoad(width, height);

            // Créer le plateau avec le chemin
            RoadBoard board = new RoadBoard(height, width, road);
            board.initBoard();

            // Afficher les coordonnées du chemin
            displayRoadCoordinates(road);

            // Afficher le plateau
            System.out.println("[X] = chemin, [ ] = cellule normale");
            board.displayBoard();

        } catch (NumberFormatException e) {
            System.err.println("Erreur: Les arguments doivent être des entiers.");
            System.err.println("Usage: java Livrable1a <largeur> <hauteur>");
            System.exit(1);
        }
    }
}