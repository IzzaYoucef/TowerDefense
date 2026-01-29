package util.Exception;


/** Exception thrown when a tower can not be placed on the a cell.
 *
 */

public class NotAbleToPlaceTowerException extends  Exception{

      /**
       * Creates a new NotAbleToPlaceTower exception.
       *
       * @param msg reason why the tower can not be placed.
       */

      public NotAbleToPlaceTowerException(String msg) {
            super(msg);
      }
}
