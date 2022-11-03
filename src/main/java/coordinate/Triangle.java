package coordinate;

import java.util.List;

public class Triangle implements Shape {
    private final List<Coordinate> coordinates;
    private static final int COORDINATE_COUNT = 3;

    public Triangle(List<Coordinate> coordinates) {
        if (!isRight(coordinates))
            throw new NullPointerException("좌표의 개수가 2개이상 이어야 합니다.");
        this.coordinates = coordinates;
    }

    @Override
    public double calculate() {
        Coordinate coordinate1 = coordinates.get(0);
        Coordinate coordinate2 = coordinates.get(1);
        Coordinate coordinate3 = coordinates.get(2);

        double sideLength1 = coordinate1.calculate(coordinate2);
        double sideLength2 = coordinate1.calculate(coordinate3);
        double sideLength3 = coordinate2.calculate(coordinate3);

        double s = (sideLength1 + sideLength2 + sideLength3) / 2.0;

        return Math.sqrt(s * (s - sideLength1) * (s - sideLength2) * (s - sideLength3));
    }

    @Override
    public boolean isRight(List<Coordinate> coordinates) {
        return coordinates.size() == COORDINATE_COUNT;
    }
}
