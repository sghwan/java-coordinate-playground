package coordinate;

import org.junit.jupiter.api.Test;
import utils.CoordinateParser;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {
    @Test
    void calculate() {
        CoordinateParser coordinateParser = new CoordinateParser();
        List<String> parsedCoordinates = coordinateParser.parseCoordinate("(10,10)-(22,10)-(10,18)-(22,18)");
        List<Coordinate> coordinates = new ArrayList<>();

        for (String parsedCoordinate : parsedCoordinates) {
            List<Integer> positions = coordinateParser.parsePosition(parsedCoordinate);
            coordinates.add(new Coordinate(new Point(positions.get(0)), new Point(positions.get(1))));
        }

        Rectangle rectangle = new Rectangle(coordinates);

        assertThat((int) rectangle.calculate()).isEqualTo(96);
    }
}
