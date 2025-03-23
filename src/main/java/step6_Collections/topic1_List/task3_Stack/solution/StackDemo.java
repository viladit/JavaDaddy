package step6_Collections.topic1_List.task3_Stack.solution;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("3");

        System.out.println(stringStack.peek());

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}
