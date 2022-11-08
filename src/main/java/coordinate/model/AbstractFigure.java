package coordinate.model;

import java.util.List;

public abstract class AbstractFigure implements Figure {
    static final String ERROR_FIGURE_NULL = "올바른 point 값이 아닙니다.";
    private final List<Point> points;

    protected AbstractFigure(List<Point> points) {
        if (points == null || points.isEmpty())
            throw new IllegalArgumentException(ERROR_FIGURE_NULL);

        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }
}
