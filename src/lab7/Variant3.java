package lab7;


import java.util.Arrays;
import java.util.List;

/**
 * 6. В предложении из n слов первое слово поставить на место второго, второе – на место третьего, и т.д.,
 * (n-1)-е слово – на место n-го, n-е слово поставить на место первого.
 * В исходном и преобразованном предложениях между словами должны быть или один пробел, или знак препинания и один пробел.
 */
public class Variant3 {

    private final String sentence;
    private final char sentenceEnd;
    private final List<String> words;

    public Variant3(String sentence) {
        this.sentence = sentence;
        this.sentenceEnd = sentence.charAt(sentence.length() - 1);
        this.words = Arrays.asList(sentence.replaceAll("[:;,]", "").split("\\s+"));
    }

    public String work() {
        final String lastWord = words.get(words.size() - 1);
        // Get last word without .?!
        final StringBuilder builder = new StringBuilder(lastWord.substring(0, lastWord.length() - 1));

        int wordEndPosition = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            final int wordBeginPosition = sentence.indexOf(words.get(i), wordEndPosition);
            wordEndPosition = wordBeginPosition + words.get(i).length();
            builder.append(sentence, wordEndPosition, sentence.indexOf(words.get(i + 1), wordEndPosition));
            builder.append(words.get(i));
        }
        return builder.append(sentenceEnd).toString();
    }

}
