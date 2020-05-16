package com.stormnet.homework.homework4.Task1;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("feline", "carnivores", "syberian", "9");
        Dog dog = new Dog("canids", "omnivorous", "chevrette", "high");
        Mouse mouse = new Mouse("rodents", "grains", "harvest", "yes");

        dog.sound();
        dog.go();
        dog.canEat(cat);
        cat.go();
        cat.canEat(mouse);
        cat.canBeEaten(dog);
        mouse.go();
        mouse.canBeEaten(cat);
    }
}