package tr.com.hepsiburada;

import tr.com.hepsiburada.model.Plateau;
import tr.com.hepsiburada.model.Point;
import tr.com.hepsiburada.model.Rover;
import tr.com.hepsiburada.util.StringUtil;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;


public class MarsRoverApplication {

    public static void main(String[] args) throws InvalidPropertiesFormatException {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter plateau limit (Ex: 5 5): ");
        String plateauInput = input.nextLine();
        int[] plateauLimits = StringUtil.plateauLimits(plateauInput);
        Plateau plateau = new Plateau(plateauLimits[0],plateauLimits[1]);

        System.out.print("Please enter point and direction of rover (Ex: 1 2 N): ");
        String roverInput = input.nextLine();
        int[] roverPoints = StringUtil.roverPoints(roverInput);
        String roverDirection = StringUtil.roverDirection(roverInput);
        Point point = new Point(roverPoints[0],roverPoints[1]);
        Rover rover = new Rover(point,roverDirection);

        plateau.setRoverLocate(rover);

        System.out.print("Please enter commands (Ex: LMLMLMLMM): ");
        String commands = input.nextLine();

        char[] commandArray = commands.toCharArray();

        for (char command : commandArray ) {
            plateau.moveRover(String.valueOf(command));
        }

        System.out.println(plateau.getRover().toString());

    }
}
