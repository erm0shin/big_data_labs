package lab5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File
 * 1. Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
 */
public class Variant4 {

    public void work() throws IOException {
        final File newFile = new File("src/lab5/output/Car.java");
        newFile.getParentFile().mkdir();
        newFile.createNewFile();

        final File currentFile = new File("src/lab3/Car.java");

        try (final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile)))) {
            final Scanner sc = new Scanner(currentFile);
            while (sc.hasNextLine()) {
                out.write(sc.nextLine().replace("public", "private"));
                out.newLine();
            }
        }
    }

}
