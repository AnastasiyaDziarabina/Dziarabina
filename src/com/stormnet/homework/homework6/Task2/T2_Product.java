package com.stormnet.homework.homework6.Task2;

public class T2_Product {

    private String typeOfProduct;
    private double price;

    public T2_Product(String typeOfProduct, double price) {
        this.typeOfProduct = typeOfProduct;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}