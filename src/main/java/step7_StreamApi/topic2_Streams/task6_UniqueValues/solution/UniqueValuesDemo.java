package step7_StreamApi.topic2_Streams.task6_UniqueValues.solution;

import java.util.List;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 2, 4, 3, 5, 1);
        System.out.println(
                list.stream().distinct().toList()
        );
    }
}
