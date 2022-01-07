package tr.com.hepsiburada.state;

import tr.com.hepsiburada.model.Point;

public abstract class RoverState {
    public Point coordinates;
    public String state;

    public RoverState(Point coordinates, String stateClassName){
        this.coordinates = coordinates;
        this.state = stateClassName;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    public String getState() {
        return state;
    }

    public abstract void moveForward();
    public abstract RoverState turnLeft();
    public abstract RoverState turnRight();
}
