package coordinate;

import java.util.List;

public interface Shape {
    double calculate();
    boolean isRight(List<Coordinate> coordinates);
}
