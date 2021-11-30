package org.example;

public class Comet {
    private String name;

    public Comet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comet{" +
                "name='" + name + '\'' +
                '}';
    }
}
