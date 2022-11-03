package coordinate;

import utils.CoordinateParser;

import java.io.IOException;
import java.util.List;

public class CoordinateCalculator {
    public static void main(String[] args) throws IOException {
        try {
            final InputView inputView = new InputView();
            final CoordinateParser coordinateParser = new CoordinateParser();
            final FigureFactory figureFactory = new FigureFactory();
            final ResultView resultView = new ResultView();

            String input = inputView.askCoordinate();
            List<Coordinate> coordinates = coordinateParser.parse(input);
            Shape shape = figureFactory.create(coordinates);

            resultView.printResult(shape);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
