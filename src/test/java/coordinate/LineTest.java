package coordinate;

import org.junit.jupiter.api.Test;
import utils.CoordinateParser;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class LineTest {
    @Test
    void calculateLineDistance() {
        CoordinateParser coordinateParser = new CoordinateParser();
        List<String> parsedCoordinates = coordinateParser.parseCoordinate("(1,2)-(4,3)");
        List<Coordinate> coordinates = new ArrayList<>();

        for (String parsedCoordinate : parsedCoordinates) {
            List<Integer> positions = coordinateParser.parsePosition(parsedCoordinate);
            coordinates.add(new Coordinate(new Point(positions.get(0)), new Point(positions.get(1))));
        }

        Line line = new Line(coordinates);

        assertThat(line.calculate()).isEqualTo(3.162, offset(0.00099));
    }
}
