package coordinate;

public class ResultView {
    public void printResult(Shape shape) {
        if (shape instanceof Line) {
            System.out.printf("두 점 사이 거리는 %.1f", shape.calculate());
        }
        if (shape instanceof Triangle) {
            System.out.printf("삼각형 넓이는 %.1f", shape.calculate());

        }
        if (shape instanceof Rectangle) {
            System.out.println("사각형 넓이는 " + shape.calculate());
        }
    }
}
