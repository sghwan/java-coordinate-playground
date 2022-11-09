package coordinate.controller;

import coordinate.model.Figure;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.io.IOException;

public class CoordinateCalculator {
    public void run() throws IOException {
        Figure figure = InputView.askCoordinate();
        ResultView.showCoordinatePlane(figure);
        ResultView.showArea(figure);
    }
}
