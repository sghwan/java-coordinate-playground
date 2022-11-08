package coordinate.model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class LineTest {
    @Test
    void area() {
        List<Point> points = new ArrayList<>(Arrays.asList(new Point(1, 2), new Point(3, 4)));

        Line line = new Line(points);
        double distance = line.area();

        assertThat(distance).isEqualTo(2.828, Offset.offset(0.00099));
    }
}
