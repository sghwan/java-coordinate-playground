package practice;

public interface Car {
    abstract double getDistancePerLiter();

    abstract double getTripDistance();

    abstract String getName();

    default double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
