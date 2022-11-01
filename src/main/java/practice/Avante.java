package practice;

public class Avante extends Car {
    private final int distance;
    private static final double FUEL_EFFICIENCY = 15.0;

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public double calculateFuelAmount() {
        return distance / FUEL_EFFICIENCY;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
