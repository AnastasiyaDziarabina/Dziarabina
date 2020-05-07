package com.stormnet.homework.homework5.Task3;

public class Array<T> {

    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + java.util.Arrays.toString(array) +
                '}';
    }

    public void returnItem(int i) {

        System.out.println(array[i]);
    }
}
