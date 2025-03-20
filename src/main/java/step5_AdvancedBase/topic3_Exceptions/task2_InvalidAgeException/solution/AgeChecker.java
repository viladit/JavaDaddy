package step5_AdvancedBase.topic3_Exceptions.task2_InvalidAgeException.solution;

public class AgeChecker {
    public static void main(String[] args) {
        try {
            checkAge(1110);
            System.out.println("OK!");
        } catch (InvalidAgeException e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст должен быть в диапазоне [0;150]");
        }
    }
}
