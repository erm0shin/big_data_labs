package lab9;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 7. Задана коллекция строк. Получить массив уникальных значений.
 */
public class Variant1 {

    private final List<String> strings;

    public Variant1(List<String> strings) {
        this.strings = strings;
    }

    public List<String> work() {
        return strings.stream()
                      .distinct()
                      .collect(Collectors.toList());
    }

}
