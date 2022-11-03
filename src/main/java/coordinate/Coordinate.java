package coordinate;

public class Coordinate {
    private final Point x;
    private final Point y;

    public Coordinate(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public double calculate(Coordinate point2) {
        return Math.sqrt(x.calculate(point2.getX()) + y.calculate(point2.getY()));
    }

    public boolean isSameXaxis(Coordinate coordinate) {
        return x.isSame(coordinate.getX());
    }

    public boolean isSameYaxis(Coordinate coordinate) {
        return y.isSame(coordinate.getY());
    }

    public boolean isRightAngle(Coordinate coordinate2, Coordinate coordinate3) {
        return this.isSameXaxis(coordinate2) && this.isSameYaxis(coordinate3);
    }

    private Point getX() {
        return x;
    }

    private Point getY() {
        return y;
    }
}
