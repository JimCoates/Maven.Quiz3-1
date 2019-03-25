package rocks.zipcode.io.quiz3.generics;

import com.sun.javafx.iio.common.SmoothMinifier;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType answer = null;

        for (SomeType element : array) {
            if (getNumberOfOccurrences(element) % 2 != 0) {
                answer = element;
            }
        }
        return answer;
    }

    public SomeType findEvenOccurringValue() {
        SomeType answer = null;

        for (SomeType element: array){
            if (getNumberOfOccurrences(element) % 2 == 0){
                answer = element;
            }
        }
        return answer;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        ArrayList<SomeType> temp = new ArrayList<>(Arrays.asList(array));
        return Collections.frequency(temp, valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
       Object [] temp = Stream.of(array).map(predicate).toArray();
       SomeType[] answer = (SomeType[]) temp;
       return answer;
    }
}
