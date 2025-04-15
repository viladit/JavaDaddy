package step7_StreamApi.topic2_Streams.task1_FilterPerson.solution;

import java.util.ArrayList;
import java.util.List;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Max", 20));
        listOfPersons.add(new Person("Dima", 34));
        listOfPersons.add(new Person("Anton", 11));
        listOfPersons.add(new Person("Zack", 65));

        List<Person> filteredList =  listOfPersons.stream().filter(person -> person.age() > 30).toList();
        System.out.println(filteredList);
    }
}
