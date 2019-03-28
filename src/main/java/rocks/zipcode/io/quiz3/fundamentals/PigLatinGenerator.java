package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String strng) {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(strng.split(" ")));
        for (String str: temp) {

            if (VowelUtils.startsWithVowel(str)) {
                str=addWayToEnd(str);
                builder.append(str + " ");
            } else if (!VowelUtils.hasVowels(str)) {
                str=addAYToEnd(str);
                builder.append(str + " ");
            } else if (!VowelUtils.startsWithVowel(str)) {
                str = shiftUntilConsonantIsFirst(str);
                str=addAYToEnd(str);
                builder.append((str) + " ");
            } else {
                return str;
            }
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

    public String shiftOnePosition(String input) {
        StringBuilder builder = new StringBuilder(input);
        String temp = Character.toString(builder.charAt(0));
        builder.deleteCharAt(0);
        builder.append(temp);

        return builder.toString();
    }

    public String shiftUntilConsonantIsFirst(String input) {

        while (!VowelUtils.startsWithVowel(input)) {
            input = shiftOnePosition(input);
        }
        return input;
    }

    public String addWayToEnd(String input) {
        StringBuilder temp = new StringBuilder(input);
        temp.append("way");
        return temp.toString();
    }

    public String addAYToEnd(String input) {
        StringBuilder temp = new StringBuilder(input);
        temp.append("ay");
        return temp.toString();
    }

}
