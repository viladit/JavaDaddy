package step2_Base.javaMethods;

import java.util.Scanner;

public class ExtractFirstDigitOfInteger_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Java method for extracting the first digit from a positive or negative integer.
            ============================================
            Example:
            Input an integer(positive/negative): 1234
            Extract the first digit from the said integer: 1
            ============================================
        """);
        try {
            System.out.print("Input an integer(positive/negative): ");
            int num = input.nextInt();
            System.out.println("Extract the first digit from the said integer: " + findFirstDigit(num));
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
    public static int findFirstDigit(int a) {
        a = a < 0 ? a * -1 : a;
        return Integer.parseInt(String.valueOf(String.valueOf(a).charAt(0)));
    }
}
