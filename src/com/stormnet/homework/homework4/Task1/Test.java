package com.stormnet.homework.homework4.Task1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("canids", "omnivorous", "chevrette", "high");
        Dog dog2 = new Dog("canids", "omnivorous", "chihuahua", "high");

      dog.sound();
        dog.go();
        dog.eat(dog2);

        Cat cat = new Cat("feline", "carnivores", "syberian", "9");
        Mouse mouse = new Mouse("rodents", "grains", "harvest", "yes");

        cat.sound();
        cat.go();
        cat.eat(mouse);

        mouse.sound();
        mouse.go();

    }

}

