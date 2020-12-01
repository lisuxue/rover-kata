import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void shouldReturnStartingPointAndDirectionWhenGettingCoordinate() {
        //GIVEN
        Point startingPoint = new Point(0, 0);
        Rover.Direction dir = Rover.Direction.N;

        Rover rover = new Rover(startingPoint, dir);
        //WHEN
        //THEN
        assertEquals(rover.getCurrentPos(), startingPoint);
        assertEquals(rover.getDir(), dir);
    }

    void shouldRegisterCommandStackWhenAttributed() {
        //GIVEN
        //WHEN
        //THEN
    }

    void shouldMoveForwardWhenOrderingF() {
        //GIVEN
        Point point = new Point(0,0);
        Rover.Direction dir = Rover.Direction.E;
        Rover rover = new Rover(point, dir);
        List<String> commands = Arrays.asList("F");

        //WHEN
        rover.sendCommand(commands);

        //THEN
        assertEquals(rover.getCurrentPos(), new Point(1,0));
    }

    void shouldMoveBackwardWhenOrderingB() {
    }

    void shouldTurnLeftWhenOrderingL() {
    }

    void shouldTurnRightWhenOrderingR() {
    }

    void testsTorique() {
    }

    void testsObstacles() {
    }
}
