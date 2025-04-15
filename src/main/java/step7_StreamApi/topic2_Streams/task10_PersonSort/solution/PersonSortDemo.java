package step7_StreamApi.topic2_Streams.task10_PersonSort.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Max", 20));
        list.add(new Person("Dima", 11));
        list.add(new Person("Vlad", 4));
        list.add(new Person("Kirill", 48));
        list.add(new Person("David", 4));

        System.out.println(
                list.stream()
                        .sorted(Comparator.comparingInt(Person::age).thenComparing(Person::name))
                        .toList()

        );
    }
}
