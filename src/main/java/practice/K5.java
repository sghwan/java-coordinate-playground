package practice;

public class K5 extends Car {
    private final int distance;
    private static final double FUEL_EFFICIENCY = 13.0;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public double calculateFuelAmount() {
        return distance / FUEL_EFFICIENCY;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
