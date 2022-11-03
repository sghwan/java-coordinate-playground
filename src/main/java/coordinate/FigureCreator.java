package coordinate;

import java.util.List;

public interface FigureCreator {
    Shape create(List<Coordinate> coordinates);
}
