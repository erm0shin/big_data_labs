package lab3;

import java.util.Scanner;

/**
 * 1. Определить класс Вектор размерности n.
 * Реализовать методы сложения, вычитания, умножения, инкремента, декремента, индексирования.
 * Определить массив из m объектов.
 * Каждую из пар векторов передать в методы, возвращающие их скалярное произведение и длины.
 * Вычислить и вывести углы между векторами.
 */
public class Variant1 {

    public void work() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dementions");
        final int dementionNumber = scanner.nextInt();

        System.out.println("Enter the number of vectors");
        int amountOfVectors = scanner.nextInt();

        final Vector[] vectors = new Vector[amountOfVectors];

        for (int i = 0; i < amountOfVectors; i++) {
            System.out.println(String.format("Enter the values of the vector [%d]", i + 1));

            final int[] vertexes = new int[dementionNumber];
            for (int j = 0; j < dementionNumber; j++) {
                System.out.println(String.format("Enter [%d] value", j + 1));

                vertexes[j] = scanner.nextInt();
            }

            vectors[i] = new Vector(vertexes);
        }

        amountOfVectors = amountOfVectors == 1 ? 1 : amountOfVectors / 2;

        for (int i = 0; i < amountOfVectors; i += 2) {
            System.out.println(String.format("Vector [%d] length: %.2f", i + 1, vectors[i].getMagnitude()));

            if (i + 1 <= vectors[i].getVectorLength()) {
                System.out.println(String.format("Vector [%d] length: %.2f", i + 2, vectors[i + 1].getMagnitude()));
                System.out.println(String.format(
                    "Angle between vectors: %.2f",
                    Vector.getAngle(vectors[i], vectors[i + 1])
                ));
            }
        }
    }

}
