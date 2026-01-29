package util;


/**
 * Represents a 2D position with coordinate x and y.
 */
public class Position {
      /** Coordinate x of the position */
      private int x ;
      /** Coordinate y of the position */
      private int y ;


      /** 
       * The constructor of a position
       * 
       * @param x the coordinate x
       * @param y the coordinate y
       */
      public Position(int x , int y) {
            this.x = x ;
            this.y = y ;
      }

      /**
       * Returns the coordinate x.
       * 
       * @return the value of x
       */
      public int getX() {
            return this.x ;
      }

      /**
       * Returns the coordinate y.
       * 
       * @return the value of y
       */
      public int getY() {
            return this.y ;
      }

      /**
       * Checks if two positions are equal.
       * @param obj the object to compare
       * @return true if two positions are equal, false otherwise
       */
      @Override
      public boolean equals(Object obj) {
            if (!(obj instanceof  Position)) {
                  return false ;
            }
            Position other = (Position) obj ;
            return this.x == other.getX() && this.y == other.getY() ;
      }

      /**
       * Return a string representation of the position.
       * 
       * @return a string in the format "(x,y)"
       */
      @Override
      public String toString() {
            return "("+this.x + "," + this.y + ")";
      }
}
