package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class SolarSystem {
    private Star star;
    private List<Planet> planets;
    private List<Comet> comets;

    public SolarSystem(Star star, List<Planet> planets, List<Comet> comets) {
        this.star = star;
        this.planets = planets;
        this.comets = comets;
    }

    @Override
    public String toString() {
        return "SolarSystem{" +
                "star=" + star +
                ", planets=" + planets +
                ", comets=" + comets +
                '}';
    }
}
