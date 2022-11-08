package coordinate.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class InputValidatorTest {
    @Test
    void checkAccuracy() {
        assertThatThrownBy(() -> InputValidator.checkAccuracy("(1,2)-(3,4")).isInstanceOf(IllegalArgumentException.class);
    }
}
