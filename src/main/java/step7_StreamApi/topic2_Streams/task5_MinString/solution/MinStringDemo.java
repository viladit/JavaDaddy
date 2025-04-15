package step7_StreamApi.topic2_Streams.task5_MinString.solution;

import java.util.Comparator;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> list = List.of("elephant", "cat", "hippopotamus", "dog", "lion");
        System.out.println(
                list.stream().min(Comparator.comparingInt(String::length)).orElse("")
        );
    }
}
