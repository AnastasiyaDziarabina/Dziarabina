package com.stormnet.homework.homework4.Task3;

import java.util.Scanner;

public class FahrenheitConverter implements Converter {

    private double temperature;
    private char type;

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degrees of temperature to convert to Fahrenheit: ");
        temperature = scanner.nextDouble();

        System.out.println("Enter the temperature type in the following format: K ");
        type = scanner.next().trim().charAt(0);
    }

    @Override
    public void convert() {

        input();

        if (type == 'K') {
            double resultConvert = 1.8 * (temperature - 273) + 32;
            System.out.println("Fahrenheit temperature is " + resultConvert);
        } else if (type != 'K') {
            System.out.println("Unknown type!");
        }
    }
}