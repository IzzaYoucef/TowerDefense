package Cell;

import Ballons.Ballon;
import Tower.Tower;
import util.Exception.NotAbleToPlaceTowerException;
import util.Position;

import java.util.ArrayList;
import java.util.List;


 

public class Cell {


    /** Position of the cell */
    private Position position ;

    /** The ballons on the cell */
    private List<Ballon> ballons ;

     /** The towers on the cell */
    private List<Tower> towers ; 

    private boolean cellPath ;


    /**
     * Constructor of a Cell.
     * 
     * @param x the X coordinate of the cell
     * @param y the Y coordinate of the cell
     */
    public Cell(int x , int y , boolean cellPath) {
        this.position = new Position(x , y) ; 
        this.cellPath = cellPath ;
        this.ballons = new ArrayList<>() ;
        this.towers = new ArrayList<>()  ;
    }
    
    public boolean isCellPath() {
        return cellPath ;
    } 
    /**
     * Returns the list of ballons on this cell.
     * 
     * @return the list of ballons on the cell
     */
    public List<Ballon> getBallons() {
        return this.ballons;
    }

    /**
     * Returns the list of towers on this cell.
     * 
     * @return the list of towers on the cell
     */
    public List<Tower> getTowers() {
        return this.towers;
    }

    /**
     * Adds a ballon to the cell.
     * 
     * @param b the ballon to add
     */
    public void addBallon(Ballon b) {
        this.ballons.add(b) ;
    }


    /**
     * Places a tower on the cell.
     * 
     * @param t the tower to place
     * @throws NotAbleToPlaceTower if the cell does not allow a tower
     */
    public void placeTower(Tower t) throws NotAbleToPlaceTowerException {
        if (!this.cellPath) {
            throw new NotAbleToPlaceTowerException("This Is A PathCell , Towers Not Allowed To Be Here") ;
        }
        this.towers.add(t);
     }

     public  void  setCellPath() {
         this.cellPath = true ;
     }
    /**
     * Cheks if two cells are equal.
     * 
     * @param obj the object to compare
     * @return true if two cells have the same position, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cell)) {
            return false ;
        }
        Cell other = (Cell) obj ;
        return this.position.equals(other.position) && this.cellPath == other.isCellPath();
    }

    /**
    * Return a string representation of the cell.
    * 
    * @return a string in the format "CELL : (x,y)"
    */
    @Override
    public String toString() {
        return  "CELL : " + this.position.toString();
    }
}
