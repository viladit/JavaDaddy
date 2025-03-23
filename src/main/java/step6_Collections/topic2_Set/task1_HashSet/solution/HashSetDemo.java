package step6_Collections.topic2_Set.task1_HashSet.solution;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Apple");

        for (String string : mySet) {
            System.out.println(string);
        }
    }
}
