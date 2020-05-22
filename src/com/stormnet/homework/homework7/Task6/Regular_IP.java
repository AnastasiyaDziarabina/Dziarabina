package com.stormnet.homework.homework7.Task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Regular_IP {
        public static void main(String[] args) {
            printFind("213.123.11.255", "54.34.23.43", "54.342.23.43", "54.34.23.143", "abc.def.gha.bcd", "4200.9.8.7");
        }

        private static void printFind(String... lines) {
            Pattern p = Pattern.compile("\\b(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\b");
            for (String string : lines) {
                Matcher matcher = p.matcher(string);
                boolean result = matcher.matches();

                if (result) {
                    System.out.println("Верный формат IP: " + string.substring(matcher.start(), matcher.end()));
                } else {
                    System.out.println("Неверный формат IP: " + string);
                }
            }
        }
    }