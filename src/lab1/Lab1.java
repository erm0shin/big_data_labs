package lab1;

public class Lab1 {

    public static void main(String[] args) {
        final Lab1 lab1 = new Lab1();
        lab1.variant1();
        lab1.variant2();
    }

    private void variant1() {
        final Variant1 variant1 = new Variant1("Text.", 10);
        variant1.work();
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2();
        variant2.read(10);
        variant2.work();
    }

}
