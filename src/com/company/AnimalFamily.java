package com.company;

public class AnimalFamily {
    private String name;

    public AnimalFamily(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
