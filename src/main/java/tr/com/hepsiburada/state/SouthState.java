package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

public class SouthState extends RoverState{

    public SouthState(Point coordinates) {
        super(coordinates);
    }

    @Override
    public void moveForward() {
        coordinates.setY(coordinates.getY() - 1);
    }

    @Override
    public RoverState turnLeft() {
        return new EastState(coordinates);
    }

    @Override
    public RoverState turnRight() {
        return new WestState(coordinates);
    }

    @Override
    public String toString() {
        return "SouthState{" +
                "coordinates=" + coordinates +
                '}';
    }
}
