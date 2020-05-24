package lab3;

public class Lab3 {

    public static void main(String[] args) {
        final Lab3 lab3 = new Lab3();
        lab3.variant1();
        lab3.variant2();
        lab3.variant3();
        lab3.variant4();
    }

    private void variant1() {
        final Variant1 variant1 = new Variant1();
        variant1.work();
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2();
        variant2.work();
    }

    private void variant3() {
        final Variant3 variant3 = new Variant3();
        variant3.work();
    }

    private void variant4() {
        final Variant4 variant4 = new Variant4();
        variant4.work();
    }

}
