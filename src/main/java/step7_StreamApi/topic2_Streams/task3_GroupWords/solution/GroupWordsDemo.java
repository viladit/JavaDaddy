package step7_StreamApi.topic2_Streams.task3_GroupWords.solution;

import java.util.List;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "ant", "banana", "berry", "cherry", "carrot");
        System.out.println(
                list.stream().collect(Collectors.groupingBy(word -> word.charAt(0)))
        );
    }
}
