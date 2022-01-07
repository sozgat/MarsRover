package tr.com.hepsiburada.util;

import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;

import static tr.com.hepsiburada.constant.ApplicationConstants.*;

public class StringUtil {

    private StringUtil() {
        throw new IllegalCallerException();
    }

    public static int[] plateauLimits(String input){
        return Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[] roverPoints(String input){
        String filtered = input.replaceAll("[a-zA-Z]","");
        return Arrays.stream(filtered.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static String roverDirection(String input) throws InvalidPropertiesFormatException {
        String filteredRoverDirection = input.replaceAll("[^A-Z]","");

        if (NORTH.equals(filteredRoverDirection)){
            return NORTH;
        }
        else if(SOUTH.equals(filteredRoverDirection)){
            return SOUTH;
        }
        else if(EAST.equals(filteredRoverDirection)){
            return EAST;
        }
        else if(WEST.equals(filteredRoverDirection)){
            return WEST;
        }
        else
            throw new InvalidPropertiesFormatException("Error for direction: " + filteredRoverDirection + "Example -> N , S, E, W");
    }

}
