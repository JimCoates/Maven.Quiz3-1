package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String captilized = str.substring(0, indexToCapitalize) +
                str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() +
                str.substring(indexToCapitalize + 1, str.length());

        return captilized;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                temp.add(string.substring(i, j));
            }
        }

        String[] answer = temp.toArray(new String[temp.size()]);
        return answer;
    }

    public static Integer getNumberOfSubStrings(String input) {
        return ((input.length() * (input.length() + 1) / 2) -1);
    }
}
