package com.stormnet.homework.homework3.Task2;

public class Task2_Calculator {

    private int a;
    private int b;

    public Task2_Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void addNumbers() {
        int result = getA() + getB();
        System.out.printf("Result of addiction %d + %d = %d \n", getA(), getB(), result);
    }

    public void subtraction() {
        int result = getA() - getB();
        System.out.printf("Result of subtraction %d - %d = %d \n", getA(), getB(), result);
    }

    public void multiplication() {
        int result = getA() * getB();
        System.out.printf("Result of subtraction %d * %d = %d \n", getA(), getB(), result);
    }

    public void division() {
        int result = getA() / getB();
        System.out.printf("Result of subtraction %d / %d = %d \n", getA(), getB(), result);
    }
}