package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void handleRangeException() {
        assertThatThrownBy(() -> new Point(25, 1)).isInstanceOf(IllegalArgumentException.class);
    }
}
