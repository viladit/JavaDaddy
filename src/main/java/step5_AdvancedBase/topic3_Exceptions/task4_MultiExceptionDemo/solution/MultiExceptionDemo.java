package step5_AdvancedBase.topic3_Exceptions.task4_MultiExceptionDemo.solution;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        int[] ints = new int[3];
        Integer object = null;

        try {
            int a = ints[2];
//            int a = ints[3];
            int b = object.byteValue();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        }
    }
}
