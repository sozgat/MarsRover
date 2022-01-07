package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

public class NorthState extends RoverState {

    public NorthState(Point coordinates) {
        super(coordinates, NorthState.class.getSimpleName());
    }

    @Override
    public void moveForward() {
        coordinates.setY(coordinates.getY() + 1);
    }

    @Override
    public RoverState turnLeft() {
        return new WestState(coordinates);
    }

    @Override
    public RoverState turnRight() {
        return new EastState(coordinates);
    }

    @Override
    public String toString() {
        return "NorthState{" +
                "coordinates=" + coordinates +
                '}';
    }
}
