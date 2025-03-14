package step2_Base.basicPart2;

import java.util.Arrays;
import java.util.Scanner;

public class RightTriangle_213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to check whether three given lengths of three sides form a right triangle.
            ============================================
            Example:
            Input three integers(sides of a triangle)
            6 9 12
            If the given sides form a right triangle?
            No
            ============================================
        """);
        try {
            String[] inputLine = input.nextLine().split(" ");
            int[] triangleSides = new int[3];
            triangleSides[0] = Integer.parseInt(inputLine[0]);
            triangleSides[1] = Integer.parseInt(inputLine[1]);
            triangleSides[2] = Integer.parseInt(inputLine[2]);
            Arrays.sort(triangleSides);
            if ((Math.pow(triangleSides[0], 2) + Math.pow(triangleSides[1], 2)) == Math.pow(triangleSides[2], 2)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
