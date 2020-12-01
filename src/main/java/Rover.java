import java.util.List;

public class Rover {

    private Point currentPos;
    // private int mapWidth = 10, maxHeight = 10;
    private Direction dir;

    public Rover(Point startingPoint, Direction dir) {
        this.currentPos = startingPoint;
        this.dir = dir;
    }

    public Point getCurrentPos() {
        return currentPos;
    }

    public Direction getDir() {
        return dir;
    }

    public void sendCommand(List<String> commands) {
        //execute
    }

    protected enum Direction {
        N,
        W,
        S,
        E
    }
}
