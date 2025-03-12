package DataTypes;

import java.util.Scanner;

public class FahrenheitToCelsiusDegree_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to convert temperature from Fahrenheit to Celsius degrees.
            ============================================
            Example:
            Input a degree in Fahrenheit: 212
            212.0 degree Fahrenheit is equal to 100.0 in Celsius
            ============================================
        """);
        try {
            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (5 * (fahrenheit - 32 )) / 9;
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
