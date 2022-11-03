package utils;

import coordinate.Coordinate;
import coordinate.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoordinateParser {
    public List<String> parseCoordinate(String input) {
        return Arrays.stream(input.split("-"))
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> parsePosition(String str_coordinate) throws NumberFormatException {
        String[] str_positions = str_coordinate.replaceAll("[(|)]", "").split(",");
        List<Integer> positions = new ArrayList<>();

        for (String str_position : str_positions) {
            positions.add(Integer.parseInt(str_position));
        }

        return positions;
    }

    public List<Coordinate> parse(String input) {
        List<String> parsedCoordinates = parseCoordinate(input);
        List<Coordinate> coordinates = new ArrayList<>();

        for (String parsedCoordinate : parsedCoordinates) {
            List<Integer> positions = parsePosition(parsedCoordinate);
            coordinates.add(new Coordinate(new Point(positions.get(0)), new Point(positions.get(1))));
        }

        return coordinates;
    }
}
