package BasicPart1;

public class SingleOccurrenceNumber_129 {
    public static void main(String[] args) {
        System.out.println("""
            ============================================
            Program to find a number that appears only once in a given array of integers. All numbers occur twice.
            ============================================
            Example: {10,2,38,23,38,23,21}
            Output: 23
            ============================================
        """);
        System.out.println("Example: {10,20,30,40,30,20,10}");
        int[] array = {10,20,30,40,30,20,10};
        int result = 0;
        for (int num : array) {
            result ^= num;
        }
        System.out.println("Output: " + result);

    }
}
