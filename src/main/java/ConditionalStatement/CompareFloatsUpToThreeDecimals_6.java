package ConditionalStatement;

import java.util.Scanner;

public class CompareFloatsUpToThreeDecimals_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program hat reads two floating-point numbers and tests whether they are the same up to three decimal places.
            ============================================
            Example:
            Input floating-point number:  25.586
            Input floating-point another number:  25.589
            They are different
            ============================================
        """);
        try {
            System.out.println("Input floating-point number: ");
            double num1 = Math.round(input.nextDouble() * 1000);
            System.out.println("Input floating-point another number: ");
            double num2 = Math.round(input.nextDouble() * 1000);
            if (num1 == num2) {
                System.out.println("They are the same up to three decimal places");
            }else {
                System.out.println("They are different");
            }
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
