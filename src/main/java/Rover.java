public class Rover {
    private enum Direction {
        N,
        W,
        S,
        E
    }

    private Point currentPos;
    // private int mapWidth = 10, maxHeight = 10;
    //private Direction

    public Rover(Point currentPos) {
        this.currentPos = currentPos;
        //this.dir = dir;
    }

    public Point getCurrentPos() {
        return currentPos;
    }




}
