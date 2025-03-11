package DataTypes;

import java.util.Scanner;

public class computeFloorDivisionAndModulus_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to compute the floor division and floor modulus of the given dividend and divisor.
            ============================================
            Example:
            Floor division using '/' operator: -18
            Floor division using floorDiv() method is: -19 
            Floor modulus using '%' operator: -115
            Floor modulus using floorMod() method is: 10
            ============================================
        """);
        try {
            System.out.print("Input first int: ");
            int x = input.nextInt();
            System.out.print("Input second int: ");
            int y = input.nextInt();
            System.out.println();
            System.out.println("Floor division using '/' operator: " + (x / y));
            System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(x, y));
            System.out.println();
            System.out.println("Floor modulus using '%' operator: " + (x % y));
            System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
