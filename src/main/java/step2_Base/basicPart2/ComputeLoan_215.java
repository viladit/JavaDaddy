package step2_Base.basicPart2;

import java.util.Scanner;

public class ComputeLoan_215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to compute the debt amount in n months.
            ============================================
            Example:
            Input number of months:
            6
            Amount of debt:
            129000
            ============================================
        """);
        double loan = 100000;
        System.out.println("Input number of months:");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            loan += loan * 0.04;
            if (loan % 1000 != 0) {
                loan -= loan % 1000;
                loan += 1000;
            }
        }
        System.out.println("Amount of debt:\n"+(int)loan);
    }
}
