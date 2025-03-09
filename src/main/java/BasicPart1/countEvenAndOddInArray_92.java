package BasicPart1;

public class countEvenAndOddInArray_92 {
    public static void main(String[] args) {
        System.out.println("""
            ============================================
            Program to count the number of even and odd elements in a given array of integers.
            ============================================
        """);
        int oddSum = 0;
        int evenSum = 0;
        int[] array = {1,5,7,89,123,2,4,8};
        System.out.print("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }
        System.out.println("\n\nNumber of even elements in the array: " + evenSum);
        System.out.println("Number of odd elements in the array: " + oddSum);
    }
}
