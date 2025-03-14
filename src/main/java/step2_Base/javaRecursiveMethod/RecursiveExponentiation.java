package step2_Base.javaRecursiveMethod;

import java.util.Scanner;

public class RecursiveExponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
            ============================================
            Example:
            Input the base number: 3.5
            Input the power of number: 4
            3.5 raised to the power of 4 is: 150.0625
            ============================================
        """);
        try {
            System.out.print("Input the base number: ");
            double base = input.nextDouble();
            System.out.print("Input the power of number: ");
            int power = input.nextInt();
            System.out.println(base + " raised to the power of " + power + " is: " + calculateExponentiation(base, power));

        }catch (Exception e) {
            System.out.println("Wrong input!");
        }

    }

    public static double calculateExponentiation(double base, int power) {
        if (power == 0) return 1;
        return base * calculateExponentiation(base, power-1);
    }
}
