package coordinate;

import java.util.List;

public class Line implements Shape {
    private final List<Coordinate> coordinates;

    public Line(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public double calculate() {
        Coordinate point1 = coordinates.get(0);
        Coordinate point2 = coordinates.get(1);
        return point1.calculate(point2);
    }
}
