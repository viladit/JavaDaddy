package step5_AdvancedBase.topic2_Generics.task3_Box.solution;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(125);

        System.out.println(box1.get());
    }
}
