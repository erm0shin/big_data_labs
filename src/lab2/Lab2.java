package lab2;

import java.util.Scanner;

public class Lab2 {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final Lab2 lab2 = new Lab2();
        lab2.variant1();
        lab2.variant2();
    }

    private void variant1() {
        final Variant1 variant1 = new Variant1();
        variant1.read(5);
        variant1.work();
    }

    private void variant2() {
        System.out.println("Print size of matrix");
        final Variant2 variant2 = new Variant2(scanner.nextInt());
        System.out.println("Print column number");
        variant2.work(scanner.nextInt());
    }

}
