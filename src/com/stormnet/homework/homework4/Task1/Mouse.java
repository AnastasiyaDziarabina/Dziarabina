package com.stormnet.homework.homework4.Task1;

public class Mouse extends Animal {

    private String hibernation;


    public Mouse(String kind, String typeOfFood, String breed, String hibernation) {
        super(kind, typeOfFood, breed);
        this.hibernation = hibernation;
    }

    public String getHibernation() {
        return hibernation;
    }

    public void setHibernation(String hibernation) {
        this.hibernation = hibernation;
    }

    @Override
    protected void sound() {
        System.out.println("Mouse says squeak-squeak");
    }

    @Override
    public void go() {
        System.out.println("Mouse goes wherever it wants");
    }

    @Override
    public void eat(Animal animal) {
        System.out.printf("Mouse can be eaten by cat or dog",animal.getBreed());
        System.out.println();
    }
}