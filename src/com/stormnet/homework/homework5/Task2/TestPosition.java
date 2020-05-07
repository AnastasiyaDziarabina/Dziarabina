package com.stormnet.homework.homework5.Task2;

public class TestPosition {
    public static void main(String[] args) {

        for (AlphabetPosition a : AlphabetPosition.values()) {
            int result = a.getLetterPosition();
            System.out.println(a + " " + result);
        }
    }
}
