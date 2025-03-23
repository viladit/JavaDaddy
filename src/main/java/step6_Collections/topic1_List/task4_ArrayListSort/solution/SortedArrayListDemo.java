package step6_Collections.topic1_List.task4_ArrayListSort.solution;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(){{
            add(15555);
            add(2);
            add(3232);
            add(10);
            add(938);
        }};
        Collections.sort(integerList);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}
