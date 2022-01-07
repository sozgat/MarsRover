package tr.com.hepsiburada.model;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import static tr.com.hepsiburada.constant.ApplicationConstants.*;

public class PlateauTest extends TestCase {

    public void testSetRoverLocate_Throw_Error_ForX() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Plateau plateau = new Plateau(1,5);
            Point point = new Point(2,1);
            Rover rover = new Rover(point,NORTH);

            plateau.setRoverLocate(rover);
        });
    }

    public void testSetRoverLocate_Throw_Error_ForY() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Plateau plateau = new Plateau(5,1);
            Point point = new Point(1,2);
            Rover rover = new Rover(point,NORTH);

            plateau.setRoverLocate(rover);
        });
    }

    public void testMoveRover() {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(1,2);
        Rover rover = new Rover(point,NORTH);

        plateau.setRoverLocate(rover);

        plateau.moveRover("R");
        Assertions.assertEquals("Rover{roverState=EastState{coordinates=Point{x=1, y=2}}}", rover.toString());
        Assertions.assertEquals("EastState{coordinates=Point{x=1, y=2}}", rover.getRoverState().toString());
    }

    public void testMoveRover2() {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(1,2);
        Rover rover = new Rover(point,NORTH);

        plateau.setRoverLocate(rover);

        plateau.moveRover("M");
        plateau.moveRover("M");
        plateau.moveRover("M");
        plateau.moveRover("M");
        plateau.moveRover("M");
        Assertions.assertEquals("Rover{roverState=NorthState{coordinates=Point{x=1, y=5}}}", rover.toString());
        Assertions.assertEquals("NorthState{coordinates=Point{x=1, y=5}}", rover.getRoverState().toString());
    }

    public void testMoveRover3() {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(4,5);
        Rover rover = new Rover(point,EAST);

        plateau.setRoverLocate(rover);

        plateau.moveRover("M");
        Assertions.assertEquals("Rover{roverState=EastState{coordinates=Point{x=5, y=5}}}", rover.toString());
        Assertions.assertEquals("EastState", rover.getRoverState().getState());
    }

    public void testMoveRover4() {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(2,2);
        Rover rover = new Rover(point,SOUTH);

        plateau.setRoverLocate(rover);

        plateau.moveRover("R");
        Assertions.assertEquals("Rover{roverState=WestState{coordinates=Point{x=2, y=2}}}", rover.toString());
        Assertions.assertEquals("WestState", rover.getRoverState().getState());
    }

    public void testMoveRover5() {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(2,2);
        Rover rover = new Rover(point,WEST);

        plateau.setRoverLocate(rover);

        plateau.moveRover("R");
        plateau.moveRover("R");
        plateau.moveRover("R");
        Assertions.assertEquals("Rover{roverState=SouthState{coordinates=Point{x=2, y=2}}}", rover.toString());
        Assertions.assertEquals("SouthState", rover.getRoverState().getState());
    }

    public void test_directionState_Default() {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(2,2);
        Rover rover = new Rover(point,"DEFAULT");

        Assertions.assertEquals("NorthState", rover.getRoverState().getState());
    }
}