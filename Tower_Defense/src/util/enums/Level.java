package util.enums ; 


public enum Level  { 
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3),
    LEVEL_4(4);

    private double resistance ; 

    private Level(double resistance) {
        this.resistance = resistance ;
    }

    public double getResistance() {
          return this.resistance ; 
    }
}