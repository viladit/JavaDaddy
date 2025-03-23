package step6_Collections.topic2_Set.task2_TreeMap.solution;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> myTree = new TreeSet<>();

        myTree.add(50);
        myTree.add(20);
        myTree.add(40);
        myTree.add(10);
        myTree.add(30);

        System.out.println(myTree);
    }
}
