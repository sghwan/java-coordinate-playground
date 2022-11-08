package coordinate.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    private static final String ERROR_INVALID_COORDINATES = "올바르지 않은 입력값입니다.";

    public static void checkAccuracy(String input) {
        Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
        Matcher matcher = pattern.matcher(input);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(ERROR_INVALID_COORDINATES);
        }
    }
}
