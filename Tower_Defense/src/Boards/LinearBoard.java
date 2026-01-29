package Boards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Cell.Cell;
import Road.Road;
import util.Position;


/**
 * Represents the game board for game mode 2.
 * LinearBoard corresponds to a board without any predefined path.
 * It is composed of a rectangular grid of normal cells on which
 * balloons move in straight lines according to their initial direction.
 *
 * This class does not handle any movement or trajectory logic.
 * It is only responsible for initializing the board structure.
 */
public class LinearBoard extends GameBoard {

    /**
     * Creates a LinearBoard with the given dimensions.
     *
     * @param height the number of rows of the board
     * @param width the number of columns of the board
     */
    public LinearBoard(int height, int width) {
        super(height, width);
        initBoard();
    }

    /**
     * Initializes the board grid.
     * Each position of the board is initialized with a NormalCell.
     * No placement restrictions are applied: towers and balloons may be
     * placed on any cell.
     */
    @Override
    public void initBoard() {

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.cells[i][j] = new Cell(i, j , false);
            }
        }
    } 

    public void generateRandomRoads(int nbpaths) {
        Random rand = new Random();
        List<Road> roads = new ArrayList<>();
        for (int i = 0; i < nbpaths; i++) {
            Road road = new Road();
            boolean horizontal = rand.nextBoolean();

            if (horizontal) {
                int y = rand.nextInt(height);
                for (int x = 0; x < width; x++) {
                    road.addPosition(new Position(x, y));
                }
            } else {
                int x = rand.nextInt(width);
                for (int y = 0; y < height; y++) {
                    road.addPosition(new Position(x, y));
                }
            }

            roads.add(road);
        }
      
        for (Road r : roads) {
            for (Position p : r.path()) {
                this.getCells()[p.getY()][p.getX()].setCellPath() ;
            }
        } 
        this.displayBoard();
    }   
      
   @Override
   public void displayBoard() {
   
       super.displayBoard();
   }
} 

 


