import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

/*    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertEquals("Food", value);
    }*/

    @Test
    void shouldGiveStartingPointWhenGettingCurrentPos() {
        //GIVEN
        Point startingPoint = new Point(0,0);
        Rover rover = new Rover(startingPoint);
        //WHEN
        //THEN
        assertEquals(rover.getCurrentPos(),startingPoint);
    }

    void shouldReturnStartingPointAndDirectionWhenGettingCoordinate() {}
    void shouldRegisterCommandStackWhenAttributed() {}
    void shouldMoveForwardWhenOrderingF() {}
    void shouldMoveBackwardWhenOrderingB() {}
    void shouldTurnLeftWhenOrderingL() {}
    void shouldTurnRightWhenOrderingR() {}
    void testsTorique() {}
    void testsObstacles() {}
}
