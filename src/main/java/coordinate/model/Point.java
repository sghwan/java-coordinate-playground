package coordinate.model;

import java.util.Objects;

public class Point {
    private static final String ERROR_OUT_OF_POINT_RANGE = "잘못된 범위 입니다. 정수 범위는 " + Point.MIN_VALUE + " ~ " + Point.MAX_VALUE + "값으로 입력해 주세요.";
    private static final int MAX_VALUE = 24;
    private static final int MIN_VALUE = 1;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        checkRangeOf(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkRangeOf(int x, int y) {
        if (exceedRange(x) || exceedRange(y))
            throw new IllegalArgumentException(ERROR_OUT_OF_POINT_RANGE);
    }

    private boolean exceedRange(int value) {
        return value > MAX_VALUE || value < MIN_VALUE;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(squareDifference(this.x, point.x) + squareDifference(this.y, point.y));
    }

    private double squareDifference(int firstValue, int secondValue) {
        return Math.pow(firstValue - secondValue, 2);
    }

    public double calculateSlope(Point point) {
        if (this.x == point.x) {
            return Double.MAX_VALUE;
        }
        return Math.abs((double) (this.y - point.y) / (this.x - point.x));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
