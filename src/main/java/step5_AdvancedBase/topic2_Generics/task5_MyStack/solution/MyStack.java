package step5_AdvancedBase.topic2_Generics.task5_MyStack.solution;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> stack = new ArrayList<>();

     public void push(T element){
         stack.add(element);
     }

     public T pop() {
         return stack.removeLast();
     }

     public T peek() {
         return stack.getLast();
     }

     public boolean isEmpty() {
         return stack.isEmpty();
     }
}
