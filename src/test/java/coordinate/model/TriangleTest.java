package coordinate.model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    @Test
    void area() {
        List<Point> points = new ArrayList<>(Arrays.asList(new Point(1, 2), new Point(5, 4), new Point(4, 2)));

        Triangle triangle = new Triangle(points);
        double area = triangle.area();

        assertThat(area).isEqualTo(3.0, Offset.offset(0.0009));
    }
}
