package Ballons;
import util.enums.Level ;

public class Ballon {

    private float speed;
    private double resistance;
    private boolean destroyed;
    private Level level;

    public Ballon(float speed, Level level) {
         this.speed = speed;
         this.level = level;
         this.resistance = level.getResistance();
         this.destroyed = false;
    }

    public void updateSpeed(float newSpeed) {
         this.speed = newSpeed;
    }

    public float getSpeed(){
        return this.speed;
    }

    public boolean isDestroyed(){
        return this.destroyed;
    }

    public Level getLevel(){
        return this.level;
    }

    public void updateResistance(int damage) {
         this.resistance -= damage;

         if (this.resistance = 0) { // On décrémente la résistance jusqu'à destruction du ballon
             this.destroyed = true;
         }

    } 


    public void moveBallon(double time);
}
