package step7_StreamApi.topic1_LambdaExpressions.task4_Filter.solution;

public interface MyPredicate<T> {
    boolean test(T t);
}
