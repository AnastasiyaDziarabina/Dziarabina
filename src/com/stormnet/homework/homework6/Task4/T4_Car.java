package com.stormnet.homework.homework6.Task4;

public class T4_Car {
    private String brand;
    private String model;
    private int price;

    public T4_Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Бренд: '" + brand + '\'' +
                " Модель: '" + model + '\'' +
                " Цена: '" + price;
    }
}