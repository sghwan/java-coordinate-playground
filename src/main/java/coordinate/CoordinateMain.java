package coordinate;

import coordinate.controller.CoordinateCalculator;

import java.io.IOException;

public class CoordinateMain {
    public static void main(String[] args) throws IOException {
        new CoordinateCalculator().run();
    }
}
