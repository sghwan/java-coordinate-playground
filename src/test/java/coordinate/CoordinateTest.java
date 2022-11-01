package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CoordinateTest {
    @Test
    void x_throwException() {
        assertThatThrownBy(() -> new Point(25))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void y_throwException() {
        assertThatThrownBy(() -> new Point(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void createCoordinate() {
        String coordinate = "12,4";
        String[] positions = coordinate.split(",");
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);

        Coordinate point = new Coordinate(new Point(x), new Point(y));

        assertThat(point).isInstanceOf(Coordinate.class);
    }

    @Test
    void coordinate_throwException() {
        String coordinate = "25,4";
        String[] positions = coordinate.split(",");
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);

        assertThatThrownBy(() -> new Coordinate(new Point(x), new Point(y)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
