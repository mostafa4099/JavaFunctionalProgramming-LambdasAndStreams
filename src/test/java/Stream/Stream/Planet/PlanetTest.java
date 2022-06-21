package Stream.Stream.Planet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Stream.Planet.PlanetTest.java: LambdasAndStreams
 * @CreationDate 6/15/2022 5:29 PM
 */
class PlanetTest {
    private List<Planet> planets = SolarSystem.getPlanets();
    private PlanetUtils planetUtils = new PlanetUtils();


    @Test
    void testTwoPlanetsStartWithM() {
        List<Planet> actual = planetUtils.getPlanetsBeginningWithM(planets);
        assertThat(actual).hasSize(2);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("Mercury", "Mars");
    }

    @Test
    void testFourPlanetsHaveRings() {
        List<Planet> actual = planetUtils.getPlanetsWithRings(planets);
        assertThat(actual).hasSize(4);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("Jupiter", "Saturn", "Uranus", "Neptune");
    }

    @Test
    void testFourPlanetsHaveMoreThanThreeMoons() {
        List<Planet> actual = planetUtils.getPlanetsWithMoreThanThreeMoons(planets);
        assertThat(actual).hasSize(4);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("Jupiter", "Saturn", "Uranus", "Neptune");
    }

    @Test
    void testThreePlanetsWithDensityGreaterThanFive() {
        List<Planet> actual = planetUtils.getPlanetsWithDensityGreaterThanFive(planets);
        assertThat(actual).hasSize(3);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("Mercury", "Venus", "Earth");
    }

}
