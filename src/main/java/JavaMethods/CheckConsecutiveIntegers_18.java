package JavaMethods;

import java.util.Arrays;
import java.util.Scanner;

public class CheckConsecutiveIntegers_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.
            ============================================
            Example:
            Input the first number: 15
            Input the second number: 16
            Input the third number: 17
            Check whether the three said numbers are consecutive or not: true
            ============================================
        """);
        try {
            System.out.print("Input the first number: ");
            int a = input.nextInt();
            System.out.print("Input the second number: ");
            int b = input.nextInt();
            System.out.print("Input the third number: ");
            int c = input.nextInt();
            System.out.println("Check whether the three said numbers are consecutive or not: " + checkConsecutive(a, b, c));
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }

    public static boolean checkConsecutive(int a, int b, int c) {
        int[] array = {a,b,c};
        Arrays.sort(array);
        return array[0] + 1 == array[1] && array[1] + 1 == array[2];
    }
}
