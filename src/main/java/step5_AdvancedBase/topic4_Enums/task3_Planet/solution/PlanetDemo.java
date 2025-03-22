package step5_AdvancedBase.topic4_Enums.task3_Planet.solution;

import java.util.ArrayList;
import java.util.List;

public class PlanetDemo {
    public static void main(String[] args) {
        List<Planet> planetList = new ArrayList<Planet>(){{
            add(Planet.EARTH);
            add(Planet.MARS);
            add(Planet.JUPITER);
        }};

        for (Planet planet : planetList) {
            System.out.println(planet.surfaceGravity());
        }
    }
}
