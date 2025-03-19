package step5_AdvancedBase.topic1_Statics.task1_Counter.solution;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.getCount());
    }
}
