package coordinate.model;

import java.util.List;

public class Triangle extends AbstractFigure {
    private static final String ERROR_INVALID_TRIANGLE = "삼각형 모양이 아닙니다.";
    private static final String OUTPUT_AREA_OF_TRIANGLE = "삼각형의 넓이는 ";

    public Triangle(List<Point> points) {
        super(points);

        if (isParallelLine(points))
            throw new IllegalArgumentException(ERROR_INVALID_TRIANGLE);
    }

    private boolean isParallelLine(List<Point> points) {
        return points.get(0).calculateSlope(points.get(1)) == points.get(0).calculateSlope(points.get(2));
    }

    @Override
    public double area() {
        Point firstPoint = getPoints().get(0);
        Point secondPoint = getPoints().get(1);
        Point thirdPoint = getPoints().get(2);

        double firstLine = firstPoint.calculateDistance(secondPoint);
        double secondLine = secondPoint.calculateDistance(thirdPoint);
        double thirdLine = thirdPoint.calculateDistance(firstPoint);

        return calculateFormulaOfHeron(firstLine, secondLine, thirdLine);
    }

    private double calculateFormulaOfHeron(double firstLine, double secondLine, double thirdLine) {
        double s = (firstLine + secondLine + thirdLine) / 2.0;

        return Math.sqrt(s * (s - firstLine) * (s - secondLine) * (s - thirdLine));
    }

    @Override
    public String getAreaInfo() {
        return OUTPUT_AREA_OF_TRIANGLE + area();
    }
}
