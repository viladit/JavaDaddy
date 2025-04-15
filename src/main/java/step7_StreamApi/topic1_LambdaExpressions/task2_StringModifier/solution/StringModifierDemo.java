package step7_StreamApi.topic1_LambdaExpressions.task2_StringModifier.solution;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier stringModifier = string -> string.toUpperCase() + "!";
        System.out.println(stringModifier.modify("маленькие буквы"));
    }
}
