package step2_Base.javaMethods;

import java.util.Scanner;

public class FindSmallestNumberAmongThree_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Java method to find the smallest number among three numbers.
            ============================================
            Example:
            Input the First number: 25
            Input the Second number: 37
            Input the Third number: 29
            The smallest value is 25.0
            ============================================
        """);
        try {
            System.out.print("Input the First number: ");
            double a = input.nextDouble();
            System.out.print("Input the Second number: ");
            double b = input.nextDouble();
            System.out.print("Input the Third number: ");
            double c = input.nextDouble();
            System.out.println("The smallest value is " + findSmallest(a, b, c));
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
    public static double findSmallest(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}
