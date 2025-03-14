package step2_Base.javaMath;

import java.util.Scanner;

public class ReverseAnInteger_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to reverse an integer number.
            ============================================
            Example:
            Input an Integer: 1237
            Output: 7321
            ============================================
        """);
        try {
            System.out.print("Input an Integer: ");
            int num = input.nextInt();
            char[] numArray = String.valueOf(num).toCharArray();
            String result = "";
            for (int i = numArray.length-1; i >= 0; i--) {
                result = result + numArray[i];
            }
            System.out.println("Output: " + result);
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
