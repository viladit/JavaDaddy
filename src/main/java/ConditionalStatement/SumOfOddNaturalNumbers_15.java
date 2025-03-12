package ConditionalStatement;

import java.util.Scanner;

public class SumOfOddNaturalNumbers_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program that displays the sum of n odd natural numbers.
            ============================================
            Example:
            Input number of terms is: 5
            The odd numbers are :
            1
            3
            5
            7
            9
            The Sum of odd Natural Number upto 5 terms is: 25
            ============================================
        """);
        try {
            System.out.print("Input number of terms is: ");
            int N = input.nextInt();
            System.out.println("The odd numbers are :");
            int start = 1;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                System.out.println(start);
                sum += start;
                start += 2;
            }
            System.out.println("The Sum of odd Natural Number upto 5 terms is: " + sum);
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
