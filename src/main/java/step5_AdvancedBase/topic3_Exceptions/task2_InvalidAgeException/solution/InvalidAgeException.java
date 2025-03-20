package step5_AdvancedBase.topic3_Exceptions.task2_InvalidAgeException.solution;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String description) {
        super(description);
    }
}
