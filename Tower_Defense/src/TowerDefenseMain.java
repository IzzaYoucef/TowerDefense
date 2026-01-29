
import Boards.GameBoard;
import Boards.RoadBoard; 
import Road.Road;
import util.Position;

public class TowerDefenseMain {
   public  static  void  main(String[] args) {
     
       Road road = new Road()  ; 


       road.addPosition(new Position(0, 0));
       road.addPosition(new Position(1, 1));
       road.addPosition(new Position(2, 2));
       road.addPosition(new Position(3, 3));
       road.addPosition(new Position(3, 2));
       road.addPosition(new Position(3, 1)); 

      GameBoard board = new RoadBoard(10, 10 , road) ;  
      board.initBoard();
      board.displayBoard(); 

       
   }
}
