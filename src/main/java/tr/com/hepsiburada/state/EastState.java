package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

public class EastState extends RoverState{

    public EastState(Point coordinates) {
        super(coordinates);
    }

    @Override
    public void moveForward() {
        coordinates.setX(coordinates.getX() + 1);

    }

    @Override
    public RoverState turnLeft() {
        return new NorthState(coordinates);
    }

    @Override
    public RoverState turnRight() {
        return new SouthState(coordinates);
    }

    @Override
    public String toString() {
        return "EastState{" +
                "coordinates=" + coordinates +
                '}';
    }
}
