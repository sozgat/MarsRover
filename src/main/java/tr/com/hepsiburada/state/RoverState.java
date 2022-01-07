package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

public abstract class RoverState {
    public Point coordinates;

    public RoverState(Point coordinates){
        this.coordinates = coordinates;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public abstract void moveForward();
    public abstract RoverState turnLeft();
    public abstract RoverState turnRight();
}
