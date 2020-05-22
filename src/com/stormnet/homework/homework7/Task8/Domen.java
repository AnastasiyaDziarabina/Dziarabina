package com.stormnet.homework.homework7.Task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Domen {
    public static void main(String[] args) {

        String site = "http://example.com";

        Pattern pattern = Pattern.compile("((http|https)://)?([\\w-]{2,63})\\.([a-z]{2,3})/?");
        Matcher matcher = pattern.matcher(site);

        boolean result = matcher.matches();

        if (result) {
            System.out.println("Корректный формат домена: " + site.substring(matcher.start(), matcher.end()));
        } else {
            System.out.println("Некорректный формат домена: " + site);
        }
    }
}