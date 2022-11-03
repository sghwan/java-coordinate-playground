package coordinate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FigureFactoryTest {
    @Test
    void create_triangle() {
        FigureCreator figureFactory = new FigureFactory();
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(new Point(1), new Point(2)));
        coordinates.add(new Coordinate(new Point(1), new Point(2)));
        coordinates.add(new Coordinate(new Point(1), new Point(2)));

        assertThat(figureFactory.create(coordinates)).isInstanceOf(Triangle.class);
    }

    @Test
    void create_rectangle() {
        FigureCreator figureFactory = new FigureFactory();
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(new Point(1), new Point(2)));
        coordinates.add(new Coordinate(new Point(1), new Point(2)));
        coordinates.add(new Coordinate(new Point(1), new Point(2)));
        coordinates.add(new Coordinate(new Point(1), new Point(2)));

        assertThat(figureFactory.create(coordinates)).isInstanceOf(Rectangle.class);
    }

    @Test
    void create_line() {
        FigureCreator figureFactory = new FigureFactory();
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(new Point(1), new Point(2)));
        coordinates.add(new Coordinate(new Point(1), new Point(2)));

        assertThat(figureFactory.create(coordinates)).isInstanceOf(Line.class);
    }
}
