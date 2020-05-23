package lab7;

import java.util.HashMap;
import java.util.Map;

/**
 * 2. Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
 */
public class Variant2 {

    private final String text;
    private final Map<String, Integer> wordsCounter = new HashMap<>();

    public Variant2(final String text) {
        if (text.isEmpty())
            throw new IllegalArgumentException("Input text must not be empty");
        this.text = text;
    }

    public void work() {
        countWords();
        printResult();
    }

    private void countWords() {
        final String words = text.replaceAll("[!?,.]", "");
        for (final String word : words.split("\\s+")) {
            if (!wordsCounter.containsKey(word))
                wordsCounter.put(word, 1);
            else
                wordsCounter.put(word, wordsCounter.get(word) + 1);
        }
    }

    private void printResult() {
        wordsCounter.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
