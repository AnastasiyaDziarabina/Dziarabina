package com.stormnet.homework.homework7.Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {

    public static class T7 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input data in format YYYY/MM/DD HH:MM:SS :");
            String data = in.nextLine();
            printFind(data);
        }
        private static void printFind(String... lines) {
            Pattern p = Pattern.compile("(\\d{0,4}\\/){2}\\d{0,4}(\\d{0,3}\\ ){1}\\d{0,3}(\\d{0,3}\\:){2}\\d{0,3}");
            for (String s : lines) {
                Matcher m = p.matcher(s);
                if (m.find()) {
                    System.out.println(m.group());
                } else {
                    System.out.println("Incorrect format!");
                }
            }
        }
    }
}
