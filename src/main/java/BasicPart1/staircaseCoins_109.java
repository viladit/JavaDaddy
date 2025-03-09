package BasicPart1;

import java.util.Scanner;

public class staircaseCoins_109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to form a staircase shape of n coins where every k-th row must have exactly k coins.
            ============================================
            Example:
            Enter number of coins: 4
            Result:
            $
            $ $
            ============================================
        """);
        System.out.print("Enter number of coins: ");
        int coins = input.nextInt();
        System.out.println("\nResult:");
        for (int i = 1; true; i++) {
            if (coins >= i) {
                coins -= i;
                System.out.println("$ ".repeat(i));
            } else {
                break;
            }
        }
    }
}
