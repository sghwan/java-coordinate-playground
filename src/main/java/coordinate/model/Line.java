package coordinate.model;

import java.util.List;

public class Line {
    public double calculate(List<Point> points) {
        Point point1 = points.get(0);
        Point point2 = points.get(1);
        return Math.sqrt(squared(point1.getX(), point2.getX()) + squared(point1.getY(), point2.getY()));
    }

    private double squared(int x1, int x2) {
        return Math.pow(x1 - x2, 2);
    }
}
