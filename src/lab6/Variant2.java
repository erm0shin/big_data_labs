package lab6;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * 1. На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
 * - добавление/удаление числа;
 * - поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
 */
public class Variant2 {

    private final Set<Integer> values = new HashSet<>();

    public boolean addNumber(final int number) {
        return values.add(number);
    }

    public boolean removeNumber(final int number) {
        return values.remove(number);
    }

    public Integer findNearest(final int number) {
        if (values.isEmpty())
            throw new NoSuchElementException("Collection is empty");

        if (values.contains(number))
            return number;

        int delta = Integer.MAX_VALUE;
        Integer candidate = null;
        for (final Integer value : values) {
            final int currentDelta = Math.abs(number - value);
            if (currentDelta <= delta) {
                delta = currentDelta;
                candidate = value;
            }
        }
        return candidate;
    }

}
