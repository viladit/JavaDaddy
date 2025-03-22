package step5_AdvancedBase.topic4_Enums.task3_Planet.solution;

public enum Planet {
    EARTH(100, 100), MARS(25, 20), JUPITER(500, 250);

    private int mass;
    private int radius;

    Planet(int mass, int radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity() {
        return 6.67430e-11 * mass / (radius * radius);
    }
}
