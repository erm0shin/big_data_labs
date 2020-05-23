package lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 7. Ввести строки из файла, записать в список ArrayList.
 * Выполнить сортировку строк
 */
public class Variant1 {
    public void work() throws IOException {
        final Class clazz = Variant1.class;
        final InputStream inputStream = clazz.getResourceAsStream("variant1.txt");
        final List<String> data = readFromInputStream(inputStream);
        data.sort(String::compareTo);
        data.forEach(System.out::println);
    }

    private List<String> readFromInputStream(final InputStream inputStream) throws IOException {
        final List<String> result = new ArrayList<>();
        try (final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        }
        return result;
    }
}
