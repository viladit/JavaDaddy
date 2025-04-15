package step7_StreamApi.topic2_Streams.task7_JoinStrings.solution;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> list = List.of("red", "green", "blue", "yellow");

        System.out.println(
                list.stream().collect(Collectors.joining(","))
        );
    }
}
