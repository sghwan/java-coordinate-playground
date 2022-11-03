package coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String askCoordinate() throws IOException {
        System.out.println("좌표를 입력하세요.");
        return br.readLine();
    }
}
