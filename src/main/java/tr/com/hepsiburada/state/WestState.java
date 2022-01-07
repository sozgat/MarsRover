package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

public class WestState extends RoverState {

    public WestState(Point coordinates) {
        super(coordinates, WestState.class.getSimpleName());
    }

    @Override
    public void moveForward() {
        coordinates.setX(coordinates.getX() - 1);
    }

    @Override
    public RoverState turnLeft() {
        return new SouthState(coordinates);
    }

    @Override
    public RoverState turnRight() {
        return new NorthState(coordinates);
    }

    @Override
    public String toString() {
        return "WestState{" +
                "coordinates=" + coordinates +
                '}';
    }
}
