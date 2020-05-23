package lab7;

public class Lab7 {

    public static void main(String[] args) {
        final Lab7 lab7 = new Lab7();
        lab7.variant1();
        lab7.variant2();
        lab7.variant3();
        lab7.variant4();
    }

    private void variant1() {
        final Variant1 sample1 = new Variant1("text text text");
        final String result1 = sample1.work(5, "injection ");
        assert "text injection text text".equals(result1);

        final Variant1 sample2 = new Variant1("text text text");
        final String result2 = sample2.work(100, " injection");
        assert "text text text injection".equals(result2);
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2("Nory was a Catholic because her mother was a Catholic, and Nory mother was a Catholic because her father was a Catholic, and her father was a Catholic because his mother was a Catholic, or had been.");
        variant2.work();
    }

    private void variant3() {
        final String inputString = "Apache Flink, is a framework and distributed processing engine: for stateful computations over unbounded; and bounded data streams.";
        final Variant3 variant3 = new Variant3(inputString);
        System.out.println("Input: " + inputString);
        System.out.println("Output: " + variant3.work());
    }

    private void variant4() {
        final Variant4 variant4 = new Variant4("aaasdf  ertttttff cvb uioopuup");
        assert "asdf ertf cvb uiopup".equals(variant4.work());
    }

}
