package lab2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Ввести с консоли n – размерность матрицы a[n][n].
 * Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 */
public class Variant2 {

    private final int size;
    private int[][] matrix;
    private final Random numberGenerator = new Random();

    public Variant2(final int size) {
        this.size = size;
        this.matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = numberGenerator.nextInt(size * 2) - size;
            }
        }
    }

    public void work(final int columnNumber) {
        final List<Integer> rowNumbers = getRowNumbers(columnNumber - 1);

        System.out.println("Initial matrix: ");
        printMatrix();

        matrix = reorderMatrix(rowNumbers);

        System.out.println("Result matrix: ");
        printMatrix();
    }

    private List<Integer> getRowNumbers(final int columnNumber) {
        final List<Pair> sortedColumn = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            sortedColumn.add(new Pair(matrix[i][columnNumber], i));
        }
        return sortedColumn.stream()
                           .sorted(Comparator.comparingInt(Pair::getKey))
                           .map(Pair::getValue)
                           .collect(Collectors.toList());
    }

    private int[][] reorderMatrix(final List<Integer> rowNumbers) {
        int[][] newMatrix = new int[size][size];
        int i = 0;
        for (final Integer rowNumber : rowNumbers) {
            System.arraycopy(matrix[rowNumber], 0, newMatrix[i], 0, size);
            i++;
        }
        return newMatrix;
    }

    private void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static class Pair {
        private final int key;
        private final int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

}
