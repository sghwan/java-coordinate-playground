package coordinate;

import java.util.List;

public class Rectangle implements Shape{
    private final List<Coordinate> coordinates;

    public Rectangle(List<Coordinate> coordinates) {
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
}
