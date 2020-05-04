package com.stormnet.homework.homework4.Task3;

import java.util.Scanner;

public class KelvinConverter implements Converter {

    private double temperature;
    private char type;

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degrees of temperature to convert to Kelvin: ");
        temperature = scanner.nextDouble();

        System.out.println("Enter the temperature type in the following format: C ");
        type = scanner.next().trim().charAt(0);
    }

    @Override
    public void convert() {

        input();

        if (type == 'C') {
            double resultConvert = temperature + 273.15;
            System.out.println("Kelvin temperature is " + resultConvert);
        } else if (type != 'C') {
            System.out.println("Unknown type!");
        }
    }
}