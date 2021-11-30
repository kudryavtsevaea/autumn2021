package org.example;

import javax.print.attribute.standard.MediaSize;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();

        Class<?>[] solarsystem = new Class<?>[2];
        solarsystem[0] = OtherSolarSystemConfig.class;
        solarsystem[1] = SolarSystemConfig.class;
        applicationContext.init(solarsystem);

        SolarSystem solarSystem = applicationContext.getBean(SolarSystem.class);
        System.out.println(solarSystem.hashCode());

        applicationContext.rewrite(solarsystem);
        System.out.println(solarsystem.hashCode());

    }
}
