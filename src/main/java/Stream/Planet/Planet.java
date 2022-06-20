package Stream.Planet;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Planet.Planet.java: LambdasAndStreams
 * @CreationDate 6/15/2022 5:24 PM
 */
public class Planet {
    private String name;
    private double density;
    private boolean hasRings;
    private int numberOfMoons;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public boolean getHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }
}
