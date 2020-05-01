package com.stormnet.homework.homework4.Task1;

public class Dog extends Animal {

    private String loyalty;


    public Dog(String kind, String typeOfFood, String breed, String loyalty) {
        super(kind, typeOfFood, breed);
        this.loyalty = loyalty;
}

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    protected void sound() {
        System.out.println("Dog says woof-woof");
    }

    @Override
    public void go() {
        System.out.println("Dog goes wherever it wants");
    }

    @Override
    public void eat(Animal animal) {
        System.out.printf("Dog can eat any %s it wants",animal.getBreed());
        System.out.println();
    }
}
