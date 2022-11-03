package coordinate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.CoordinateParser;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {
    CoordinateParser coordinateParser;

    @BeforeEach
    void setUp() {
        coordinateParser = new CoordinateParser();
    }

    @Test
    void calculate() {
        //given
        List<Coordinate> coordinates = coordinateParser.parse("(10,10)-(22,10)-(10,18)-(22,18)");

        //when
        Rectangle rectangle = new Rectangle(coordinates);

        //then
        assertThat((int) rectangle.calculate()).isEqualTo(96);
    }

    @Test
    void checkRectangle() {
        List<Coordinate> coordinates = coordinateParser.parse("(10,12)-(22,10)-(10,18)-(22,18)");

        assertThatThrownBy(() -> new Rectangle(coordinates)).isInstanceOf(NullPointerException.class);
    }

    @AfterEach
    void tearDown() {
        coordinateParser = null;
    }
}
