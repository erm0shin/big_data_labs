package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
 */
public class Variant1 {

    private final Scanner scanner = new Scanner(System.in);
    private final List<String> strings = new ArrayList<>();

    public void read(final int numbersCount) {
        for (int i = 0; i < numbersCount; i++) {
            strings.add(scanner.next());
        }
    }

    public void work() {
        System.out.println("In ascending order");
        strings.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println("In descending order");
        strings.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);
    }

}
