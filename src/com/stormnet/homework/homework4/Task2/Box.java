package com.stormnet.homework.homework4.Task2;

public class Box extends Shape {

    private double displayedVolume;

    public Box(double volume, String type) {
        super(volume, type);
    }

    public void boxVolume(double volume) {

        volume = super.getVolume();
    }

    public boolean addShape(Shape shape) {

        boolean canAdd = true;

        if (this.volume >= (displayedVolume + shape.getVolume())) {
            displayedVolume += shape.getVolume();
            System.out.printf("Figure: %s added \n", shape.getType());
            System.out.printf("Displayed volume is %s \n", displayedVolume);
        } else {
            System.out.printf("Unable to add the new figure: %s to the box \n", shape.getType());
            canAdd = false;
        }

        return canAdd;
    }
}