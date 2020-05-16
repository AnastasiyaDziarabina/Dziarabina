package com.stormnet.homework.homework4.Task2;

public class Test {
    public static void main(String[] args) {

        Ball ball = new Ball(0, "Ball", 6);
        Cylinder cylinder = new Cylinder(0, "Cylinder", 6, 6);
        Pyramid pyramid = new Pyramid(0, "Pyramid", 100, 110);
        Pyramid pyramid2 = new Pyramid(0, "Pyramid", 1500, 10);

        Box box = new Box(8300, "Box");

        box.addShape(ball);
        box.addShape(cylinder);
        box.addShape(pyramid);
        box.addShape(pyramid2);
    }
}