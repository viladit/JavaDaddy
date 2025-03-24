package step6_Collections.topic4_Map.task1_HashMap.solution;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] strings = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String, Integer> myHashMap = new HashMap<>();
        for (String string : strings) {
            myHashMap.put(string, myHashMap.getOrDefault(string,0) + 1);
        }

        System.out.println(myHashMap);
    }
}
