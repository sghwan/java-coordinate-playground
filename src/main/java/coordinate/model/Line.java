package coordinate.model;

import java.util.List;

public class Line {
    private static final String OUTPUT_AREA_OF_LINE = "두 점 사이 거리는 ";
    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public double area() {
        return getPoints().get(0).calculateDistance(getPoints().get(1));
    }

    public String getAreaInfo() {
        return OUTPUT_AREA_OF_LINE + area();
    }
}
