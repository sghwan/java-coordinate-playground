package coordinate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.CoordinateParser;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {
    CoordinateParser coordinateParser;

    @BeforeEach
    void setUp() {
        coordinateParser = new CoordinateParser();
    }

    @Test
    void calculate() {
        //given
        List<Coordinate> coordinates = coordinateParser.parse("(10,10)-(14,15)-(20,8)");

        //when
        Triangle triangle = new Triangle(coordinates);

        //then
        assertThat(triangle.calculate()).isEqualTo(29.0, offset(0.9));
    }

    @Test
    void checkShape() {
        List<Coordinate> coordinates = coordinateParser.parse("(1,2)-(1,3)");

        assertThatThrownBy(() -> new Triangle(coordinates)).isInstanceOf(NullPointerException.class);
    }

    @AfterEach
    void tearDown() {
        coordinateParser = null;
    }
}
