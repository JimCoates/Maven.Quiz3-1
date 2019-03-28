package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    final static String vowels = "aeiouAEIOU";

    public static Boolean hasVowels(String word) {

        if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("u") || word.contains("o") ||
        word.contains("A") || word.contains("E") || word.contains("I") || word.contains("U") || word.contains("O")) {
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains(String.valueOf(word.charAt(i)))){
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return getIndexOfFirstVowel(word) == 0;
    }

    public static Boolean isVowel(Character character) {
        return vowels.contains(String.valueOf(character));
    }
}
