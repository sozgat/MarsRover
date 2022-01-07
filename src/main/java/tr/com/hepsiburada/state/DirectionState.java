package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

import static tr.com.hepsiburada.constant.ApplicationConstants.*;


public class DirectionState {

    public static RoverState setRoverDirectionState(Point coordinates, String direction){
        int x = coordinates.getX();
        int y = coordinates.getY();

        switch (direction){
            case NORTH:
                return new NorthState(new Point(x,y));
            case SOUTH:
                return new SouthState(new Point(x,y));
            case EAST:
                return new EastState(new Point(x,y));
            case WEST:
                return new WestState(new Point(x,y));
            default:
                return new NorthState(new Point(x,y));
        }
    }
}
