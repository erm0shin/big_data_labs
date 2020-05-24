package lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Car {

    private static final AtomicLong idGenerator = new AtomicLong(0);

    private final long id = idGenerator.incrementAndGet();
    ;
    private String mark;
    private String model;
    private int manufactureYear;
    private String color;
    private long price;
    private String registrationNumber;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }

    public Car(String model, int manufactureYear) {
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    public Car(int manufactureYear, long price) {
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public Car(
        String mark,
        String model,
        int manufactureYear,
        String color,
        long price,
        String registrationNumber
    ) {
        this.mark = mark;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public long getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public static List<Car> produceCars(final int carsNumber, final String mark) {
        List<Car> cars = new ArrayList<>(carsNumber);
        for (int i = 0; i < carsNumber; i++) {
            cars.add(new Car(mark));
        }
        return cars;
    }

    public static List<Car> produceCars(final int carsNumber, String model, int manufactureYear) {
        List<Car> cars = new ArrayList<>(carsNumber);
        for (int i = 0; i < carsNumber; i++) {
            cars.add(new Car(model, manufactureYear));
        }
        return cars;
    }

    public static List<Car> produceCars(final int carsNumber, int manufactureYear, long price) {
        List<Car> cars = new ArrayList<>(carsNumber);
        for (int i = 0; i < carsNumber; i++) {
            cars.add(new Car(manufactureYear, price));
        }
        return cars;
    }

    public static List<Car> findCarsByMark(
        final List<Car> cars,
        final String mark
    ) {
        return cars.stream()
                   .filter(car -> car.getMark().equals(mark))
                   .collect(Collectors.toList());
    }

    public static List<Car> findCarsByModelAndAge(
        final List<Car> cars,
        final String model,
        final int age
    ) {
        return cars.stream()
                   .filter(car -> car.getModel().equals(model)
                       && LocalDate.now().getYear() - car.getManufactureYear() > age)
                   .collect(Collectors.toList());
    }

    public static List<Car> findCarsByManufacturedYearAndPrice(
        final List<Car> cars,
        final int manufactureYear,
        final long price
    ) {
        return cars.stream()
                   .filter(car -> car.getManufactureYear() == manufactureYear
                       && car.getPrice() > price)
                   .collect(Collectors.toList());
    }

}
