package step5_AdvancedBase.topic2_Generics.task5_MyStack.solution;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(100);
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        myStack.push(200);
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.isEmpty());
    }
}
