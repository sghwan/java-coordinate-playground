package utils;

import coordinate.Coordinate;
import coordinate.Point;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CoordinateParserTest {
    CoordinateParser coordinateParser;

    @BeforeEach
    void setUp() {
        coordinateParser = new CoordinateParser();
    }

    @Test
    void parseCoordinate() {
        List<String> coordinates = coordinateParser.parseCoordinate("(1,2)-(3,4)");

        assertThat(coordinates.size()).isEqualTo(2);
        assertThat(coordinates.get(0).length()).isEqualTo(5);
        assertThat(coordinates.get(1).length()).isEqualTo(5);
    }

    @Test
    void parseCoordinate_by_order() {
        List<String> coordinates = coordinateParser.parseCoordinate("(10,10)-(22,10)-(22,18)-(10,18)");

        assertThat(coordinates.size()).isEqualTo(4);
        assertThat(coordinates.get(0)).isEqualTo("(10,10)");
        assertThat(coordinates.get(1)).isEqualTo("(10,18)");
        assertThat(coordinates.get(2)).isEqualTo("(22,10)");
        assertThat(coordinates.get(3)).isEqualTo("(22,18)");
    }

    @Test
    void parsePosition() {
        List<Integer> positions = coordinateParser.parsePosition("(1,2)");

        assertThat(positions.get(0)).isEqualTo(1);
        assertThat(positions.get(1)).isEqualTo(2);
    }

    @Test
    void subStringTest() {
        String str = "(1,2)";
        assertThat(str.substring(1, 4)).isEqualTo("1,2");
    }

    @AfterEach
    void tearDown() {
        coordinateParser = null;
    }
}
