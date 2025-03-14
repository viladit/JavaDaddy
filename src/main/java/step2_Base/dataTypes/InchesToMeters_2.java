package step2_Base.dataTypes;

import java.util.Scanner;

public class InchesToMeters_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program that reads a number in inches and converts it to meters.
            ============================================
            Example:
            Input a value for inch: 1000
            1000.0 inch is 25.4 meters
            ============================================
        """);
        System.out.print("Input a value for inch: ");
        try {
            double inches = input.nextDouble();
            double metres = inches * 0.0254;
            System.out.println(inches + " inch is " + metres + " metres");
        } catch (Exception e) {
            System.out.println("Wrong input");
        }

    }
}
