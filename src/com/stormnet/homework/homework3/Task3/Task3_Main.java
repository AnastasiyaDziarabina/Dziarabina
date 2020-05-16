package com.stormnet.homework.homework3.Task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Task3_Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Task3_Data card = new Task3_Data("1111 1111 1111 1116", "Debit", "IvanIvanov", sdf.parse("26.04.2020"), "123");

        ArrayList<Task3_Data> cardList = new ArrayList();
        cardList.add(new Task3_Data("1111111111111116", "Credit", "IvanIvanov", sdf.parse("20.05.2021"), "123"));
        cardList.add(new Task3_Data("1111111111111117", "Debit", "PetrPetrov", sdf.parse("15.07.2020"), "456"));
        cardList.add(new Task3_Data("1111111111111118", "Credit", "SemenSidorov", sdf.parse("10.02.2020"), "777"));
        cardList.add(new Task3_Data("1111111111111119", "Debit", "AlenaSmirnova", sdf.parse("29.09.2022"), "666"));

        Task3_Data.Validator.validationCard(cardList, card);
    }
}