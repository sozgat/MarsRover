package tr.com.hepsiburada.model;


import tr.com.hepsiburada.state.EastState;
import tr.com.hepsiburada.state.NorthState;
import tr.com.hepsiburada.state.SouthState;
import tr.com.hepsiburada.state.WestState;

import static tr.com.hepsiburada.constant.ApplicationConstants.*;


public class Plateau {
    private int limitX;
    private int limitY;
    private Rover rover;

    public Plateau(int limitX, int limitY) {
        this.limitX = limitX;
        this.limitY = limitY;
    }

    public void setRoverLocate(Rover rover){
        if (rover.getCoordinates().getX() > this.limitX)
            throw new IndexOutOfBoundsException();
        if (rover.getCoordinates().getY() > this.limitY)
            throw new IndexOutOfBoundsException();
        this.rover = rover;
    }

    public void moveRover(String command){
     switch (command){
         case MOVE_FORWARD:
             if ((this.rover.getRoverState().getState().equals(EastState.class.getSimpleName()) ||
                     this.rover.getRoverState().getState().equals(WestState.class.getSimpleName())) &&
                     this.rover.getCoordinates().getX() < this.limitX)
                 this.rover.moveForward();
             if((this.rover.getRoverState().getState().equals(NorthState.class.getSimpleName()) ||
                     this.rover.getRoverState().getState().equals(SouthState.class.getSimpleName())) &&
                     this.rover.getCoordinates().getY() < this.limitY)
                 this.rover.moveForward();
             break;
         case TURN_LEFT:
             this.rover.turnLeft();
             break;
         case TURN_RIGHT:
             this.rover.turnRight();
             break;
         default:
             break;
     }
    }

    public Rover getRover() {
        return rover;
    }

}
