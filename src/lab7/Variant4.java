package lab7;

/**
 * 5. Заменить все одинаковые рядом стоящие символы в тексте одним символом.
 */
public class Variant4 {

    private final String text;
    private final char[] characterArray;

    public Variant4(String text) {
        this.text = text;
        characterArray = text.toCharArray();
    }

    public String work() {
        final char[] resultArray = new char[text.length()];
        int j = 0;
        for (int i = 0; i < characterArray.length; i++) {
            if (i + 1 < text.length() && characterArray[i] == characterArray[i + 1]) {
                int pos = i + 1;
                while (characterArray[pos] == characterArray[pos + 1])
                    pos++;
                i = pos;
            }
            resultArray[j] = characterArray[i];
            j++;
        }
        return new String(resultArray, 0, j);
    }

}
