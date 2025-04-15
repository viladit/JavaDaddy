package step7_StreamApi.topic1_LambdaExpressions.task1_Calculator.solution;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println("Сумма: " + calculator.operate(10, 77));
    }
}
