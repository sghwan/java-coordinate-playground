package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoordinateParser {
    private static final int BEGIN_INDEX = 1;
    private static final int END_INDEX = 4;

    public List<String> parseCoordinate(String input) {
        return Arrays.asList(input.split("-"));
    }

    public List<Integer> parsePosition(String str_coordinate) throws NumberFormatException {
        String[] str_positions = str_coordinate.substring(BEGIN_INDEX, END_INDEX).split(",");
        List<Integer> positions = new ArrayList<>();

        for (String str_position : str_positions) {
            positions.add(Integer.parseInt(str_position));
        }

        return positions;
    }
}
