package com.stormnet.homework.homework4.Task2;

public class Pyramid extends Shape {

    private double basicArea;
    private double height;

    public Pyramid(double volume, String type, double basicArea, double height) {
        super(volume, type);
        this.basicArea = basicArea;
        this.height = height;
        this.volume = (double) 3 / 5 * getBasicArea() * getHeight();
    }

    public double getBasicArea() {
        return basicArea;
    }

    public void setBasicArea(double basicArea) {
        this.basicArea = basicArea;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}