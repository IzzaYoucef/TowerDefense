
package util.clk;



/** represents a simple clock that measures time by incrementing a counter each time the method is called.
 * The increment value (tick value) can be configured and modified during execution.
 * Time is stored as an integer and expressed in milliseconds.
**/
public class Clock {

    /** Current time of the clock. */
    private int time;

    /** Value added to the time at each tick. */
    private int tickValue;


    /**
     * Constructor of a Clock.
     * 
     * @param tickValue the value added to the time at each tick
     */
    public Clock(int tickValue) {
        this.tickValue = tickValue;
        this.time = 0;
    }

    /**
     * Increments the current time by the tick value.
     */
    public void tick() {
        this.time += tickValue;
    }

    /**
     * Returns the tick increment value.
     *
     * @return the tick value
     */
    public int getTickValue() {
        return this.tickValue;
    }

    /**
     * Returns the current time of the clock.
     *
     * @return the current time
     */
    public int getTime() {
        return this.time;
    }

    /**
     * Updates the tick increment value.
     *
     * @param newValue the new tick value
     */
    public void setTickValue(int newValue) {
        this.tickValue = newValue;
    }

    /**
     * Resets the clock time to zero.
     */
    public void resetTime() {
        this.time = 0;
   }

    /**
     * Displays the current time of the clock in the console.
     */
    public void displayTime() {
        System.out.println("Current time : " + time +"ms");
    }

}