package ru.geekbrains.DZ;

public class Apple implements Fruit {
    final float WEIGHT = 1.0f;
    final String NAME = "Apple";

    @Override
    public float getWeight() {
        return WEIGHT;
    }
    @Override
    public String getName() {
        return NAME;
    }
}
