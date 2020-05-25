package lab5;

import java.io.IOException;

public class Lab5 {

    public static void main(String[] args) throws IOException {
        final Lab5 lab5 = new Lab5();
        lab5.variant1();
        lab5.variant2();
        lab5.variant3(args);
        lab5.variant4();
    }

    private void variant1() {
        final Variant1 variant1 = new Variant1();
        variant1.work();
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2();
        variant2.work();
    }

    private void variant3(String[] args) throws IOException {
        final Variant3 variant3 = new Variant3();
        variant3.work(args[0], args[1], "test");
    }

    private void variant4() throws IOException {
        final Variant4 variant4 = new Variant4();
        variant4.work();
    }

}
