package com.stormnet.homework.homework4.Task1;

public abstract class Animal implements Characteristics {

    protected String kind;
    protected String typeOfFood;
    protected String breed;

    public Animal(String kind, String typeOfFood, String breed) {
        this.kind = kind;
        this.typeOfFood = typeOfFood;
        this.breed = breed;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    protected abstract void sound();
}