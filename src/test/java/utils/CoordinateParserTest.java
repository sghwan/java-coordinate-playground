package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CoordinateParserTest {
    CoordinateParser coordinateParser;

    @BeforeEach
    void setUp() {
        coordinateParser = new CoordinateParser();
    }

    @Test
    void line_parseCoordinate() {
        List<String> coordinates = coordinateParser.parseCoordinate("(1,2)-(3,4)");

        assertThat(coordinates.size()).isEqualTo(2);
        assertThat(coordinates.get(0).length()).isEqualTo(5);
        assertThat(coordinates.get(1).length()).isEqualTo(5);
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
