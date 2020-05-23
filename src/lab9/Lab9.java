package lab9;

import java.util.Arrays;
import java.util.List;

public class Lab9 {

    public static void main(String[] args) {
        final Lab9 lab7 = new Lab9();
        lab7.variant1();
        lab7.variant2();
    }

    private void variant1() {
        final Variant1 variant1 = new Variant1(Arrays.asList("test", "qwerty", "test", "zxcv", "qwerty", "test"));
        List<String> result = variant1.work();
        result.forEach(System.out::println);
    }

    private void variant2() {
        final Variant2 variant2 = new Variant2(Arrays.asList(90, 80, 70, 60, 50));
        Double result = variant2.work();
        assert 60 == result;
    }

}
