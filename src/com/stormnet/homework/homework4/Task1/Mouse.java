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
}