package practice;

public class Sonata extends Car {
    private final int distance;
    private static final double FUEL_EFFICIENCY = 10.0;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public double calculateFuelAmount() {
        return distance / FUEL_EFFICIENCY;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
