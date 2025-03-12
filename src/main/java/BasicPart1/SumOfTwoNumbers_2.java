package BasicPart1;

import java.util.Scanner;

public class SumOfTwoNumbers_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program for summing to numbers
            ============================================
            Type 2 numbers to get their sum.
            Example:
            Enter first number: 5
            Enter second number: 10
            Result: 15
            ============================================
        """);
        try {
            System.out.print("Enter first number: ");
            int FirstNum = input.nextInt();
            System.out.print("Enter second number: ");
            int SecondNum = input.nextInt();
            int Result = FirstNum + SecondNum;
            System.out.println("Result: " + Result);
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}