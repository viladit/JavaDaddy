package step5_AdvancedBase.topic4_Enums.task5_Operation.solution;

public class OperationDemo {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.apply(2, 5));
        System.out.println(Operation.MINUS.apply(5, 2));
        System.out.println(Operation.TIMES.apply(2, 5));
        System.out.println(Operation.DIVIDE.apply(5, 2));
    }
}
