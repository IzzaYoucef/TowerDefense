package Boards;

import Cell.Cell;
import Road.Road;
import util.Position;

public class RoadBoard extends GameBoard{

    public Road road ;

    public RoadBoard(int height , int width , Road road) {
          super(height , width); 
          this.road = road ; 
    }

    @Override
    public void initBoard() {

        for (int i = 0 ; i < this.height ; i++) {
            for (int j = 0 ; j < this.width ; j++) {
                if (this.road.path().contains(new Position(i , j))){
                    this.cells[i][j] = new Cell(i, j, true) ; 
                } else {
                    this.cells[i][j] = new Cell(i, j, false) ; 
                }
                
            }
        }
    }


}
