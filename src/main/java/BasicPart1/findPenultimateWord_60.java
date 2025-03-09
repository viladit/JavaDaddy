package BasicPart1;

import java.util.Scanner;

public class findPenultimateWord_60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Penultimate word program
            ============================================
            Type a line to get penultimate word.
            Example:
            Input a String: The quick brown fox jumps over the lazy dog.
            Penultimate word: lazy
            ============================================
        """);
        System.out.print("Input a String: ");
        try {
            String line = input.nextLine();
            String[] splitLine = line.split(" ");
            System.out.println("Penultimate word: " + splitLine[splitLine.length-2]);
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
