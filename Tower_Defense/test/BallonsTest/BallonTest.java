package BallonsTest ; 

import org.junit.jupiter.api.*;

import util.enums.Level;
import Ballons.Ballon;

import static org.junit.jupiter.api.Assertions.*;

public class BallonTest { 

    private Ballon ballon1 ;  
    private Ballon ballon2 ;  
    // On pourrait faire + de ballons.


    @BeforeEach
    public void start() {  
      this.ballon1 = new Ballon(20, Level.LEVEL_1);  
      this.ballon2 = new Ballon(15, Level.LEVEL_2); // On part du principe qu'il est + résistant donc + lent
    }  

    @Test
    public void testBallonNonDestroyedOnCreation() { // Le ballon ne doit pas être détruit à sa création.
       assertFalse(this.ballon1.isDestroyed());
    }

    @Test 
    public void testResistanceLevelOfBallon() {
        assertEquals(this.ballon1.getLevel().getResistance(),10);
        assertEquals(this.ballon2.getLevel().getResistance(),15);
    }

    @Test
    public void testUpdateSpeedMethodeWorksPerfectly() {
        this.ballon1.updateSpeed(20) ;  
        assertEquals(this.ballon1.getSpeed(), 20);


        this.ballon2.updateSpeed(25);
        assertEquals(this.ballon2.getLevel().getResistance(),25);


 
    } 
    
    public void testResistanceUpdateandDestroyBallon() {
        while(this.ballon1.isDestroyed()) {
            this.ballon1.updateResistance(2); 
        }
        assertTrue(this.ballon1.isDestroyed()); 

    }  

}