package com.stormnet.homework.homework4.Task3;

import java.util.Scanner;

public class CelsiusConverter implements Converter {
    private double temperature;
    private char type;

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degrees of temperature to convert to Celsius: ");
        temperature = scanner.nextDouble();

        System.out.println("Enter the temperature type in the following format: F ");
        type = scanner.next().trim().charAt(0);
    }

    @Override
    public void convert() {

        input();

        if (type == 'F') {
            double resultConvert = (temperature - 32) / 1.8;
            System.out.println("Celsius temperature is " + resultConvert);
        } else if (type != 'F') {
            System.out.println("Unknown type!");
        }
    }
}