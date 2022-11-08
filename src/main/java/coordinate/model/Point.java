package coordinate.model;

public class Point {
    private static final int MAX_VALUE = 25;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if (!validateRange(x) || !validateRange(y))
            throw new IllegalArgumentException("좌표값의 범위는 24이하 입니다.");
        this.x = x;
        this.y = y;
    }

    private boolean validateRange(int value) {
        return value < MAX_VALUE;
    }
}
