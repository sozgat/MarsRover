package tr.com.hepsiburada;

import com.sun.tools.javac.Main;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MarsRoverApplicationTest extends TestCase {

    public void testMain() throws Exception {
        System.out.println("Main Test is running");

        String plateauInput = "5 5";
        String roverInput = "1 2 N";
        String commands = "LMLMLMLMM";

        String simulatedUserInput = plateauInput + System.getProperty("line.separator")
                + roverInput + System.getProperty("line.separator") + commands;

        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes(StandardCharsets.UTF_8)));

        MarsRoverApplication.main(new String[] {"arg1", "arg2", "arg3"});

    }
}