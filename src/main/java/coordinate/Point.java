package coordinate;

public class Point {
    private final int position;
    private static final int MAX_VALUE = 24;
    private static final int MIN_VALUE = 0;

    public Point(int position) {
        if (position > MAX_VALUE || position < MIN_VALUE)
            throw new IllegalArgumentException("좌표 값은 최대 24까지만 입력할 수 있습니다.");
        this.position = position;
    }

    public double calculate(Point point) {
        return Math.pow(position - point.getPosition(), 2);
    }

    private int getPosition() {
        return this.position;
    }

    public boolean isSame(Point point) {
        return position == point.getPosition();
    }
}
