package org.example;

import java.util.List;

public class SolarSystemConfig {

    @Bean
    @Prototype
    public static SolarSystem getSolarSystem(Star star, List<Planet> planets, List<Comet> comets){
        return new SolarSystem(star, planets, comets);
    }

    @Bean
    @Prototype
    public static Star getStar(){
        return new Star("Sun");
    }

    @Bean("Earth")
    @Prototype
    public static Planet getPlanet(){
        return new Planet("Earth");
    }

    @Bean
    @Prototype
    public static Planet getPlanet2(){
        return new Planet("Juno");
    }

    @Bean
    @Prototype
    public static Comet getComet(){ return new Comet("Galeya"); }

}
