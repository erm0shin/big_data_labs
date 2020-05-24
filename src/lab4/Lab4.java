package lab4;

public class Lab4 {

    public static void main(String[] args) {
        final Lab4 lab4 = new Lab4();
        lab4.variant1();
        lab4.variant2();
    }

    private void variant1() {
        final Variant1 variant1 = new Variant1();
        variant1.work();
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2();
        variant2.work();
    }

}
