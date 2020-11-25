package HomeWork5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        text = text.toLowerCase(); // переводит текст в нижний регистр
        word = word.toLowerCase();// переводит слово в нижний регистр

        long result = 0;
        Pattern pattern = Pattern.compile(" " + word + " ");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}
