package step7_StreamApi.topic2_Streams.task4_CountEvenNumbers.solution;

import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 20, 25, 30, 35);

        System.out.println(
                list.stream().filter(n -> n % 2 == 0).count()
        );
    }
}
