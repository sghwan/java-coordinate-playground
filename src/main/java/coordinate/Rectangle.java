package coordinate;

import java.util.List;

public class Rectangle implements Shape {
    private final List<Coordinate> coordinates;
    private static final int COORDINATE_COUNT = 4;

    public Rectangle(List<Coordinate> coordinates) {
        if (!isRight(coordinates))
            throw new NullPointerException("좌표는 2개 이상이어야 합니다.");
        this.coordinates = coordinates;
    }

    @Override
    public double calculate() {
        Coordinate coordinate1 = coordinates.get(0);
        Coordinate coordinate2 = coordinates.get(1);
        Coordinate coordinate3 = coordinates.get(2);

        double height = coordinate1.calculate(coordinate2);
        double width = coordinate1.calculate(coordinate3);

        return height * width;
    }

    @Override
    public boolean isRight(List<Coordinate> coordinates) {
        if (coordinates.size() != COORDINATE_COUNT)
            return false;

        Coordinate coordinate1 = coordinates.get(0);
        Coordinate coordinate2 = coordinates.get(1);
        Coordinate coordinate3 = coordinates.get(2);
        Coordinate coordinate4 = coordinates.get(3);

        boolean judge1 = coordinate1.isRightAngle(coordinate2, coordinate3);
        boolean judge2 = coordinate4.isRightAngle(coordinate3, coordinate2);

        return judge1 && judge2;
    }
}
