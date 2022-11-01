package practice;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> cars;
    private static final String NEWLINE = System.getProperty("line.separator");

    private RentCompany(List<Car> cars) {
        this.cars = cars;
    }

    public static RentCompany create() {
        return new RentCompany(new ArrayList<>());
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        cars.forEach(car -> sb.append(car.getName()).append(" : ").append((int) car.getChargeQuantity()).append("리터").append(NEWLINE));
        return sb.toString();
    }
}
