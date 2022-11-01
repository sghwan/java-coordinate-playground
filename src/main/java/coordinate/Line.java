package coordinate;

import java.util.List;

public class Line implements Shape {
    private final List<Coordinate> points;

    public Line(List<Coordinate> points) {
        this.points = points;
    }

    @Override
    public double calculate() {
        Coordinate point1 = points.get(0);
        Coordinate point2 = points.get(1);
        return point1.calculate(point2);
    }
}
