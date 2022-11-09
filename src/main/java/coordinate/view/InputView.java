package coordinate.view;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Point;
import coordinate.utils.InputValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private static final String QUESTION_OF_COORDINATE = "좌표를 입력하세요.";
    private static final String COORDINATE_DELIMITER = "-";
    private static final String ERROR_OF_INVALID_COORDINATE = "올바르지 않는 입력 값입니다.";
    private static final String ERROR_DUPLICATE_POINTS = "중복된 좌표가 존재합니다.";
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Figure askCoordinate() throws IOException {
        System.out.println(QUESTION_OF_COORDINATE);
        return askCoordinate(br.readLine());
    }

    public static Figure askCoordinate(String input) throws IOException {
        try {
            input = input.replace(" ", "");
            InputValidator.checkAccuracy(input);
            List<Point> points = generatePoints(input);
            return FigureFactory.create(points);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askCoordinate();
        }
    }

    private static List<Point> generatePoints(String input) {
        String[] coordinates = input.split(COORDINATE_DELIMITER);

        List<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            points.add(generatePoint(coordinate));
        }
        checkDuplicationOf(points);
        return points;
    }

    private static Point generatePoint(String coordinate) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
        Matcher matcher = pattern.matcher(coordinate);
        if (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            return new Point(x, y);
        }
        throw new IllegalArgumentException(ERROR_OF_INVALID_COORDINATE);
    }

    private static void checkDuplicationOf(List<Point> points) {
        if (points.size() != new HashSet<>(points).size()) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_POINTS);
        }
    }
}
