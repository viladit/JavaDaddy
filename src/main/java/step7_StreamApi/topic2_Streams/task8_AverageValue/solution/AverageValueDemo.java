package step7_StreamApi.topic2_Streams.task8_AverageValue.solution;

import java.util.List;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        System.out.println(
                list.stream().mapToInt(n -> n).average()
        );
    }
}
