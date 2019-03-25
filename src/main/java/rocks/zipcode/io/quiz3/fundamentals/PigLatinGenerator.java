package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        StringBuilder builder = new StringBuilder(str);

        if(VowelUtils.startsWithVowel(str)){
            return addWayToEnd(str);
        } else if(!VowelUtils.hasVowels(str)) {
            return addAYToEnd(str);
        } else if (!VowelUtils.startsWithVowel(str)){
            str = shiftUntilConsonantIsFirst(str);
            return addAYToEnd(str);
        } else {
            return str;
        }
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
