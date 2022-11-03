package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoordinateParser {
    private static final int BEGIN_INDEX = 1;
    private static final int END_INDEX = 4;

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
}
