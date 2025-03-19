package step5_AdvancedBase.topic1_Statics.task3_Config.solution;

public class Config {
    private static String configVersion = "v1.0.0";

    public static void displayConfig() {
        System.out.println(configVersion);
    }
}
