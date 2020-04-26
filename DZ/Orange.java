package ru.geekbrains.DZ;

public class Orange implements Fruit {
    final float WEIGHT = 1.5f;
    final String NAME = "Orange";

    @Override
    public float getWeight() {
        return WEIGHT;
    }
    @Override
    public String getName() {
        return NAME;
    }
}
