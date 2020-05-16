package com.stormnet.homework.homework4.Task2;

public class Ball extends SolidOfRevolution {

    public Ball(double volume, String type, double radius) {

        super(volume, type, radius);
        this.volume = (double) 4 / 2 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return volume;
    }
}