package coordinate.model;

import java.util.List;

public class Line {
    public double area(List<Point> points) {
        return points.get(0).calculateDistance(points.get(1));
    }
}
