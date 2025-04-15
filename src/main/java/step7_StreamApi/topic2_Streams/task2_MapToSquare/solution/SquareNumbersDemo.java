package step7_StreamApi.topic2_Streams.task2_MapToSquare.solution;

import java.util.ArrayList;
import java.util.List;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> squares = numbers.stream().map(n -> n * n).toList();

        System.out.println(squares);
    }
}
