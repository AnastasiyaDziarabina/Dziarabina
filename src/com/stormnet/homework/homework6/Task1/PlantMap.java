package com.stormnet.homework.homework6.Task1;

import java.util.HashMap;
import java.util.Map;

public class PlantMap<S, S1> {

    private Map<String, String> Map = new HashMap<>();

    void getAllPlants(Map<String, String> plants) {
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            System.out.println(plant.getKey() + " " + plant.getValue());
        }
    }

    void getPlant(Map<String, String> plants, String type) {

        for (Map.Entry<String, String> plant : plants.entrySet()) {

            if (type.equals(plant.getValue())) {
                System.out.printf("Ответ: %s - это %s \n", plant.getKey(), plant.getValue());
            }
        }
    }
}