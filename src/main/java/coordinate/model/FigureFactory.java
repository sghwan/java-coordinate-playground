package coordinate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
    private static final String ERROR_INVALID_FIGURE_CREATION = "입력된 Point 개수가 유효하지 않습니다.";
    private static final int NUMBER_OF_LINE_COORDINATE = 2;
    private static final int NUMBER_OF_TRIANGLE_COORDINATE = 3;
    private static final int NUMBER_OF_RECTANGLE_COORDINATE = 4;
    private static final Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();

    static {
        classifier.put(NUMBER_OF_LINE_COORDINATE, Line::new);
        classifier.put(NUMBER_OF_TRIANGLE_COORDINATE, Triangle::new);
        classifier.put(NUMBER_OF_RECTANGLE_COORDINATE, Rectangle::new);
    }

    public static Figure create(List<Point> points) {
        if (points == null) {
            throw new IllegalArgumentException(AbstractFigure.ERROR_FIGURE_NULL);
        }
        if (isInvalidNumberOf(points)) {
            throw new IllegalArgumentException(ERROR_INVALID_FIGURE_CREATION);
        }

        return classifyFigure(points);
    }

    private static boolean isInvalidNumberOf(List<Point> points) {
        return points.size() > NUMBER_OF_RECTANGLE_COORDINATE || points.size() < NUMBER_OF_LINE_COORDINATE;
    }

    private static Figure classifyFigure(List<Point> points) {
        return classifier.get(points.size()).apply(points);
    }
}
