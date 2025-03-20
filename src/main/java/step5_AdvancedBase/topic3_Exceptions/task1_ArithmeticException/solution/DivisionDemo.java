package step5_AdvancedBase.topic3_Exceptions.task1_ArithmeticException.solution;

import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите делимое: ");
            int a = scanner.nextInt();
            System.out.print("Введите делитель: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Результат: " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Зачем ты ввёл 0? \uD83D\uDE20");
            }
        }
    }
}
