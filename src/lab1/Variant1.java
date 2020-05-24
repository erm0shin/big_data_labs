package lab1;

/**
 * 3. Создать приложение, выводящее n строк с переходом и без перехода на новую строку.
 */
public class Variant1 {

    private final String text;
    private final int repeatNumber;

    public Variant1(final String text, final int repeatNumber) {
        this.text = text;
        this.repeatNumber = repeatNumber;
    }

    public void work() {
        for (int i = 0; i < repeatNumber; i++) {
            System.out.print(text);
        }
        for (int i = 0; i < repeatNumber; i++) {
            System.out.println(text);
        }
    }

}
