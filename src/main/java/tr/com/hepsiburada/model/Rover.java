package tr.com.hepsiburada.model;

import tr.com.hepsiburada.state.DirectionState;
import tr.com.hepsiburada.state.RoverState;

public class Rover {

    private RoverState roverState;

    public Rover(Point coordinates, String direction ) {
        this.roverState = DirectionState.setRoverDirectionState(coordinates,direction);
    }
    public void moveForward(){
        this.roverState.moveForward();
    }

    public void turnLeft(){
        this.roverState = this.roverState.turnLeft();
    }

    public void turnRight(){
        this.roverState = this.roverState.turnRight();
    }

    public Point getCoordinates(){
        return this.roverState.getCoordinates();
    }

    @Override
    public String toString() {
        return "Rover{" +
                "roverState=" + roverState +
                '}';
    }

    public RoverState getRoverState() {
        return roverState;
    }
}
