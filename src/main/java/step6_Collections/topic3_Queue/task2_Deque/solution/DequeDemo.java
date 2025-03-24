package step6_Collections.topic3_Queue.task2_Deque.solution;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(5);
        deque.addLast(6);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());

        System.out.println(deque);

    }
}
