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
        List<String> coordinates = coordinateParser.parseCoordinate("(1,2)-(4,3)");
        List<Coordinate> points = new ArrayList<>();

        for (String coordinate : coordinates) {
            List<Integer> positions = coordinateParser.parsePosition(coordinate);
            points.add(new Coordinate(new X(positions.get(0)), new Y(positions.get(1))));
        }

        Line line = new Line(points);

        assertThat(line.calculate()).isEqualTo(3.162, offset(0.00099));
    }
}
