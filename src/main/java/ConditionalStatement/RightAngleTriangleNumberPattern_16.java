package ConditionalStatement;

import java.util.Scanner;

public class RightAngleTriangleNumberPattern_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to display the pattern like a right angle triangle with a number.
            ============================================
            Example:
            Input number of rows : 10
            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910
            ============================================
        """);
        try {
            System.out.println("Input number of rows : ");
            int rows = input.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
