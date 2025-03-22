package step5_AdvancedBase.topic4_Enums.task4_Season.solution;

public enum Season {
    WINTER(-25), SPRING(5), SUMMER(25), FALL(10);

    private double temperature;

    Season(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        return "Season: " + this.name() + ", AVG Temp: " + temperature +"C";
    }
}
