package step6_Collections.topic1_List.task1_ArrayList.solution;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(3);

        list.remove(Integer.valueOf(20));

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
