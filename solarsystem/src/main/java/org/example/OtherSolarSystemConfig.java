package org.example;

public class OtherSolarSystemConfig {
    @Bean
    @Prototype
    public static Planet getPlanet3(){
        return new Planet("Venus");
    }

    @Bean
    @Prototype
    public static Comet getComet2() { return new Comet("H82"); }
}
