package com.stormnet.homework.homework6.Task1;

import java.util.HashMap;
import java.util.Map;

public class Task1_Test {

    public static void main(String[] args) {

        T1_PlantMap plant = new T1_PlantMap<>();
        Map<String, String> plants = new HashMap<>();

        plants.put("арбуз", "ягода");
        plants.put("капуста", "овощ");
        plants.put("апельсин", "фрукт");
        plants.put("пшеница", "зерновые");

        plant.getAllPlants(plants);
        plant.getPlant(plants,"овощ");

    }
}