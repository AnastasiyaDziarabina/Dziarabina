package com.stormnet.homework.homework7.Task3;

import java.io.*;

public class T3_RevString {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream("test_reverse.txt")) {

            System.out.println("Введите вашу строку: ");
            String string = new StringBuilder(br.readLine()).reverse().toString();

            byte[] buffer = string.getBytes();

            fos.write(buffer, 0, buffer.length);

            System.out.println("Строка успешно добавлена в файл!");

        } catch (IOException e) {
            e.getMessage();
        }
    }
}