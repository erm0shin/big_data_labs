package lab3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Создать классы, спецификации которых приведены ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * 8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 * Создать массив объектов.
 * Вывести: a) список автомобилей заданной марки;
 * b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
 * c) список автомобилей заданного года выпуска, цена которых больше указанной.
 */
public class Variant2 {

    public void work() {
        List<Car> mercedesCars = Car.produceCars(5, "Mercedes");
        List<Car> bmwCars = Car.produceCars(5, "BMW");
        List<Car> audiCars = Car.produceCars(5, "Audi");
        Car.findCarsByMark(squashLists(mercedesCars, bmwCars, audiCars), "BMW").forEach(System.out::println);

        List<Car> x5Cars = Car.produceCars(5, "X5", 2010);
        List<Car> x3Cars = Car.produceCars(5, "X3", 2015);
        List<Car> x6NewCars = Car.produceCars(5, "X6", 2018);
        List<Car> x6OldCars = Car.produceCars(5, "X6", 2013);
        Car.findCarsByModelAndAge(squashLists(x5Cars, x3Cars, x6NewCars, x6OldCars), "X6", 5)
           .forEach(System.out::println);

        List<Car> a4Cars = Car.produceCars(5, 2010, 4000000);
        List<Car> a3Cars = Car.produceCars(5, 2018, 2000000);
        List<Car> a6Cars = Car.produceCars(5, 2010, 6000000);
        Car.findCarsByManufacturedYearAndPrice(squashLists(a4Cars, a3Cars, a6Cars), 2010, 5000000).forEach(System.out::println);
    }

    @SafeVarargs
    private final List<Car> squashLists(List<Car>... lists) {
        return Stream.of(lists)
                     .flatMap(Collection::stream)
                     .collect(Collectors.toList());
    }

}
