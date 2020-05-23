package lab6;

import java.io.IOException;

public class Lab6 {

    public static void main(String[] args) throws IOException {
        final Lab6 lab6 = new Lab6();
        lab6.variant1();
        lab6.variant2();
    }

    private void variant1() throws IOException {
        final Variant1 variant1 = new Variant1();
        variant1.work();
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2();
        variant2.addNumber(6);
        variant2.addNumber(1);
        variant2.addNumber(-10);
        variant2.addNumber(90);
        variant2.addNumber(-23);
        variant2.addNumber(90);
        variant2.addNumber(-90);
        variant2.addNumber(50);

        variant2.removeNumber(1);
        variant2.removeNumber(10);
        variant2.removeNumber(-23);

        assert 6 == variant2.findNearest(6);
        assert 90 == variant2.findNearest(70);
        assert -10 == variant2.findNearest(-30);
    }

}
