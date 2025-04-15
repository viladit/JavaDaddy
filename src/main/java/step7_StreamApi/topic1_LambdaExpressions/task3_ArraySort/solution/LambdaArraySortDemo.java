package step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort.solution;

import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Java", "Lambda", "Stream", "API"};
        Arrays.sort(arrayOfStrings, (string1, string2) -> Integer.compare(string1.length(), string2.length()));

        System.out.println(Arrays.toString(arrayOfStrings));

    }
}
