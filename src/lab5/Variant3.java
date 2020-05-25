package lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия. При этом могут рассматриваться два варианта:
 * - каждая строка состоит из одного слова;
 * - каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут быть введены как параметры командной строки или храниться в файле.
 * 1. В каждой строке найти и удалить заданную подстроку.
 */
public class Variant3 {

    public void work(final String inputFile, final String outputString, final String substring) throws IOException {
        final List<String> list = new ArrayList<>();
        try (final BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(inputFile))))) {
            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replaceAll(substring, ""));
        }

        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(outputString))))) {
            for (final String formattedLine : list) {
                bw.write(formattedLine);
                bw.newLine();
            }
        }
    }

}
