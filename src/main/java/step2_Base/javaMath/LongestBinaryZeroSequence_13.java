package step2_Base.javaMath;

import java.util.Scanner;

public class LongestBinaryZeroSequence_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to find the length of the longest sequence of zeros in binary representation of an integer.
            ============================================
            Example:
            Input a Decimal Number: 7
            Binary number is: 111
            Length of the longest sequence: 0
            ============================================
        """);
        try {
            int maxLength = 0;
            int length = 0;
            System.out.print("Input a Decimal Number: ");
            String binaryString = Integer.toBinaryString(input.nextInt());
            for (int i = 0; i < binaryString.length(); i++) {
                if ("0".equals(String.valueOf(binaryString.charAt(i)))) {
                    length++;
                } else {
                    maxLength = Math.max(maxLength, length);
                    length = 0;
                }
            }
            maxLength = Math.max(maxLength, length);
            System.out.println("Binary number is: " + binaryString);
            System.out.println("Length of the longest sequence: " + maxLength);
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
