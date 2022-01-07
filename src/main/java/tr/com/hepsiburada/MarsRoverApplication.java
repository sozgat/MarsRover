package tr.com.hepsiburada;

import tr.com.hepsiburada.model.Plateau;
import tr.com.hepsiburada.model.Point;
import tr.com.hepsiburada.model.Rover;
import static tr.com.hepsiburada.constant.ApplicationConstants.*;


public class MarsRoverApplication {

    public static void main(String[] args) {
        Plateau plateau = new Plateau(5,5);
        Point point = new Point(1,1);
        Rover rover = new Rover(point,NORTH);

        plateau.setRoverLocate(rover);

        plateau.moveRover(TURN_LEFT);
        plateau.moveRover(TURN_LEFT);
        plateau.moveRover(TURN_LEFT);
        plateau.moveRover(MOVE_FORWARD);

        System.out.println(plateau.getRover().toString());

    }
}
