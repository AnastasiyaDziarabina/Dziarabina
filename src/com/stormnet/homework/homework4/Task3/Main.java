package com.stormnet.homework.homework4.Task3;

public class Main {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        celsiusConverter.convert();
        fahrenheitConverter.convert();
        kelvinConverter.convert();
    }
}