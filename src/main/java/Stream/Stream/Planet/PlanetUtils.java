package Stream.Stream.Planet;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Stream.Planet.PlanetUtils.java: LambdasAndStreams
 * @CreationDate 6/15/2022 5:25 PM
 */
public class PlanetUtils {
    public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getName().startsWith("M"))
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithRings(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getHasRings())
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getNumberOfMoons() > 3)
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getDensity() > 5)
                .collect(Collectors.toList());
    }
}
