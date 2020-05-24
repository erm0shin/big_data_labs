package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:
 * 2. Наибольшее и наименьшее число.
 */
public class Variant2 {

    private static final String EMPTY_LIST_ERROR = "Input list is empty";

    private final Scanner scanner = new Scanner(System.in);
    private final List<Integer> numbers = new ArrayList<>();

    public void read(final int numbersCount) {
        for (int i = 0; i < numbersCount; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    public void work() {
        final int min = numbers.stream()
                               .mapToInt(v -> v)
                               .min()
                               .orElseThrow(() -> new NoSuchElementException(EMPTY_LIST_ERROR));
        final int max = numbers.stream()
                               .mapToInt(v -> v)
                               .max()
                               .orElseThrow(() -> new NoSuchElementException(EMPTY_LIST_ERROR));
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }

}
