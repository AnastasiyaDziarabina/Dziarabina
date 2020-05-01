package com.stormnet.homework.homework4.Task1;

public abstract class Animal implements Characteristics{
    protected String kind;
    protected String typeOfFood;
    protected String breed;

    protected abstract void sound ();

    public Animal(String kind, String typeOfFood, String breed) {
        this.kind = kind;
        this.typeOfFood = typeOfFood;
        this.breed = breed;
    }

    public String getKind() {
        return kind;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getBreed() {
        return breed;
    }
}
