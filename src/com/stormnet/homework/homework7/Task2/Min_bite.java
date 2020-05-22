package com.stormnet.homework.homework7.Task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Min_bite {

    public static class MinBite {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream file = new FileInputStream(reader.readLine());
            int min = file.read();
            while (file.available()>0)
            {
                int data = file.read();
                if (data<min)
                {
                    min = data;
                }
            }
            file.close();
            System.out.println(min);
        }
    }
}
