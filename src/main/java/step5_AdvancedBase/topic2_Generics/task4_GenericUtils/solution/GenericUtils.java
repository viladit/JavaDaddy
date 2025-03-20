package step5_AdvancedBase.topic2_Generics.task4_GenericUtils.solution;

public class GenericUtils {
    public static <T extends Comparable<T>> T Max(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        }
        return b;
    }
}
