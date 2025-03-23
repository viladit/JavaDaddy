package step6_Collections.topic1_List.task2_LinkedList.solution;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("last");
        list.addFirst("newFirst");
        list.addLast("newLast");

        for (String string : list) {
            System.out.println(string);
        }

        System.out.println();

        list.removeFirst();
        list.removeLast();

        for (String string : list) {
            System.out.println(string);
        }
    }
}
