package step6_Collections.topic3_Queue.task1_Queue.solution;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("A");
        myQueue.offer("B");
        myQueue.offer("C");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }
}
