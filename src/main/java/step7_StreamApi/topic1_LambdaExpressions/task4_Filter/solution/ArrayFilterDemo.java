package step7_StreamApi.topic1_LambdaExpressions.task4_Filter.solution;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {
    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : array) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arrayOfNums = {5, 12, 7, 20, 3};
        System.out.println(
                filterArray(arrayOfNums, n -> n > 10)
        );
    }
}
