package coordinate;

import java.util.List;

public class FigureFactory implements FigureCreator{
    @Override
    public Shape create(List<Coordinate> coordinates) {
        if (coordinates.size() == 2)
            return new Line(coordinates);
        if (coordinates.size() == 3)
            return new Triangle(coordinates);
        if (coordinates.size() == 4)
            return new Rectangle(coordinates);
        throw new NullPointerException("좌표는 2개 이상이어여 합니다.");
    }
}
