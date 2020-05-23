package lab7;

/**
 * 5. В тексте после k-го символа вставить заданную подстроку.
 */
public class Variant1 {

    private final String text;

    public Variant1(final String text) {
        this.text = text;
    }

    public String work(final int position, final String substring) {
        if (position > text.length())
            return text + substring;

        return text.substring(0, position) + substring + text.substring(position);
    }

}
