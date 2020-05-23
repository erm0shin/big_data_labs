package lab9;

import java.util.List;

/**
 * 7. Задана коллекция чисел. Вычесть из каждого значения 10 и получить среднее.
 */
public class Variant2 {

    private final List<Integer> numbers;

    public Variant2(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Double work() {
        return numbers.stream()
                      .map(number -> number - 10)
                      .mapToDouble(Integer::doubleValue)
                      .average()
                      .orElseThrow(() -> new IllegalArgumentException("Input list is empty"));
    }

}
