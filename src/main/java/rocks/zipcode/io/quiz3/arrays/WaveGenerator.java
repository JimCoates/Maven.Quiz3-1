package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();

        ArrayList<String> answerArray = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                temp = StringUtils.capitalizeNthCharacter(str, i);
                answerArray.add(temp);
            }
        }

        String[] answer = answerArray.toArray(new String[answerArray.size()]);
        return answer;
    }
}

