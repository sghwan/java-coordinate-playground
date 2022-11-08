package coordinate.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {
    @Test
    void area() {
        List<Point> points = new ArrayList<>(Arrays.asList(new Point(1, 2), new Point(1, 4), new Point(4, 2), new Point(4, 4)));
        Rectangle rectangle = new Rectangle(points);
        double area = rectangle.area();

        assertThat(area).isEqualTo(6.0);
    }
}
