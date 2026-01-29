package Road;

import util.Position;

import java.util.ArrayList;
import java.util.List;

public class Road {

    private List<Position> pth;

    public Road() {
         this.pth = new ArrayList<>();
    }

    public void addPosition(Position p) {
          this.pth.add(p);
    }

    public List<Position> path() {
          return this.pth;
    }
}
