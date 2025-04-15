package step7_StreamApi.topic2_Streams.task9_PersonToMap.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Max", 20));
        list.add(new Person("Dima", 11));
        list.add(new Person("Vlad", 4));
        list.add(new Person("Kirill", 48));
        list.add(new Person("David", 52));

        Map<String, Integer> map = list.stream().collect(Collectors.toMap(person -> person.name(), person -> person.age()));

        System.out.println(map);
    }
}
