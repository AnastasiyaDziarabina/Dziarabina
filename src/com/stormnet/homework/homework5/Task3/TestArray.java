package com.stormnet.homework.homework5.Task3;

public class TestArray {
    public static void main(String[] args) {

        Array<Integer> array1 = new Array<>(new Integer[]{1, 2, 9, 33, 66, 5, 13});
        Array<String> array2 = new Array<>(new String[]{"a", "b", "c", "d", "e", "f", "g"});

        array1.returnItem(3);
        array2.returnItem(5);

    }
}
