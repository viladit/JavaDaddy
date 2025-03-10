package BasicPart2;

import java.util.Scanner;

public class lengthOfLastWord_181 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to find the length of the last word in a given string.
            ============================================
            Example:
            Original String: The length of last word
            Length of the last word of the above string: 4
            ============================================
        """);
        System.out.print("Original String: ");
        String[] inputLine = input.nextLine().split(" ");
        int length = inputLine.length > 0 ? inputLine[inputLine.length-1].length() : 0;
        System.out.println("Length of the last word of the above string: " + length);
    }
}
