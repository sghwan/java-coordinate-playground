package coordinate;

import java.util.List;

public class Line implements Shape {
    private final List<Coordinate> coordinates;
    private static final int COORDINATE_COUNT = 2;

    public Line(List<Coordinate> coordinates) {
        if (!isRight(coordinates))
            throw new NullPointerException("좌표의 개수가 2개이상 이어야 합니다.");
        this.coordinates = coordinates;
    }

    @Override
    public double calculate() {
        Coordinate point1 = coordinates.get(0);
        Coordinate point2 = coordinates.get(1);
        return point1.calculate(point2);
    }

    @Override
    public boolean isRight(List<Coordinate> coordinates) {
        return coordinates.size() == COORDINATE_COUNT;
    }
}
