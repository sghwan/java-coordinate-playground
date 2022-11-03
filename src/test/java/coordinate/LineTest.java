package coordinate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.CoordinateParser;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class LineTest {
    CoordinateParser coordinateParser;

    @BeforeEach
    void setUp() {
        coordinateParser = new CoordinateParser();
    }

    @Test
    void calculateLineDistance() {
        //given
        List<Coordinate> coordinates = coordinateParser.parse("(1,2)-(4,3)");

        //when
        Line line = new Line(coordinates);

        //then
        assertThat(line.calculate()).isEqualTo(3.162, offset(0.00099));
    }

    @Test
    void checkLine() {
        List<Coordinate> coordinates = coordinateParser.parse("(1,2)");

        assertThatThrownBy(() -> new Line(coordinates)).isInstanceOf(NullPointerException.class);
    }

    @AfterEach
    void tearDown() {
        coordinateParser = null;
    }
}
