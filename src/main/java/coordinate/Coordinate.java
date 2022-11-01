package coordinate;

public class Coordinate {
    private final X x;
    private final Y y;

    public Coordinate(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public double calculate(Coordinate point2) {
        return Math.sqrt(x.calculate(point2.getX()) + y.calculate(point2.getY()));
    }

    private Y getY() {
        return y;
    }

    private X getX() {
        return x;
    }
}
