package step5_AdvancedBase.topic2_Generics.task3_Box.solution;

public class Box<T> {
    private T value;

    public Box(){}

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
