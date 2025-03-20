package step5_AdvancedBase.topic3_Exceptions.task5_Finally.solution;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Ресурс открыт.");
            int a = 1007 / 0;
        } catch (Exception e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        } finally {
            System.out.println("Ресурс закрыт.");
        }
    }
}
