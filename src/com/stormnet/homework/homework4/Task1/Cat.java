package com.stormnet.homework.homework4.Task1;

public class Cat extends Animal {

    private String livesCount;


    public Cat(String kind, String typeOfFood, String breed, String livesCount) {
        super(kind, typeOfFood, breed);
        this.livesCount = livesCount;
    }

    public String getlivesCount() {
        return livesCount;
    }

    public void setlivesCount(String livesCount) {
        this.livesCount = livesCount;
    }

    @Override
    protected void sound() {
        System.out.println("Cat says meow-meow");
    }

    @Override
    public void go() {
        System.out.println("Cat goes wherever it wants");
    }

    @Override
    public void eat(Animal animal) {
        System.out.printf("Cat can eat mouse",animal.getBreed());
        System.out.println();
    }
}