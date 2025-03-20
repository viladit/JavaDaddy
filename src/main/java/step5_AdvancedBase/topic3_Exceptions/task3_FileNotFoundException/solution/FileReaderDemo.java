package step5_AdvancedBase.topic3_Exceptions.task3_FileNotFoundException.solution;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("qweqwe")){
            System.out.println("OK!");
        } catch (Exception e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        }
    }
}
