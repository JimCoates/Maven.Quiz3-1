package rocks.zipcode.io.quiz3.generics;

import com.sun.javafx.iio.common.SmoothMinifier;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
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
       List<SomeType> temp = Stream.of(array).filter(value-> predicate.apply(value)).collect(Collectors.toList());
       return temp.toArray((SomeType[]) Array.newInstance(array[0].getClass(), temp.size()));
    }
}
