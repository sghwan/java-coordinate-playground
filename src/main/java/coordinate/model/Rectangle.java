package coordinate.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rectangle {
    private static final String OUTPUT_AREA_OF_RECTANGLE = "직사각형의 넓이는 ";
    private static final String ERROR_INVALID_RECTANGLE = "직사각형 모양이 아닙니다.";
    private static final int NUMBER_OF_RECTANGLE_COORDINATE = 2;
    private final List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
        checkRectangleWith(points);
    }

    private void checkRectangleWith(List<Point> points) {
        Set<Integer> xValueOfPoints = convertToUniqueXValues(points);
        Set<Integer> yValueOfPoints = convertToUniqueYValues(points);

        if (hasNotTwoPoints(xValueOfPoints) || hasNotTwoPoints(yValueOfPoints))
            throw new IllegalArgumentException(ERROR_INVALID_RECTANGLE);
    }

    private boolean hasNotTwoPoints(Set<Integer> valueOfPoints) {
        return valueOfPoints.size() != NUMBER_OF_RECTANGLE_COORDINATE;
    }

    private Set<Integer> convertToUniqueXValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getX);
    }

    private Set<Integer> convertToUniqueYValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getY);
    }

    private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(Collectors.toSet());
    }

    public double area() {
        List<Point> points = getPoints();
        int differenceOfXValues = calculateDifference(convertToUniqueXValues(points));
        int differenceOfYValues = calculateDifference(convertToUniqueYValues(points));

        return differenceOfXValues * differenceOfYValues;
    }

    private int calculateDifference(Set<Integer> valueOfPoints) {
        List<Integer> values = new ArrayList<>(valueOfPoints);

        return Math.abs(values.get(0) - values.get(1));
    }

    public String getAreaInfo() {
        return OUTPUT_AREA_OF_RECTANGLE + area();
    }

    private List<Point> getPoints() {
        return this.points;
    }
}
