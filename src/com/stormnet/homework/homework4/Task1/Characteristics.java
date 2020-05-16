package com.stormnet.homework.homework4.Task1;

public interface Characteristics {

    void go();

    default void canBeEaten(Animal animal) {
        System.out.println(animal.getKind() + " will eat me now ");
    }
    default void canEat(Animal animal) {
        System.out.println(" Now I can eat " + animal.getKind());
    }
}