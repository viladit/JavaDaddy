package step5_AdvancedBase.topic2_Generics.task2_ArrayUtils.solution;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
