package step5_AdvancedBase.topic2_Generics.task2_ArrayUtils.solution;


public class ArraysUtilsDemo {
    public static void main(String[] args) {
        Integer[] ints = {1,2};
        String[] strings = {"first", "second"};

        test(ints);
        test(strings);

        ArrayUtils.swap(ints, 0, 1);
        ArrayUtils.swap(strings, 0, 1);

        test(ints);
        test(strings);
    }
    public static <T> void test(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
