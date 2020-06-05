package com.stormnet.hw_automation.hw1_05_06.lesson0206.Tes2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Продукты, деликатесы");
        expectedResult.add("Книги");
        expectedResult.add("Косметика, парфюмерия");
        expectedResult.add("Дом, сад, зоотовары");
        expectedResult.add("Разлвечения, творчество");
        expectedResult.add("Канцтовары, учеба");
        expectedResult.add("Сувениры, подарки");
        expectedResult.add("Детям и мамам");
        expectedResult.add("Теризм, отдых, спорт");
        expectedResult.add("Техника, электроника");
        expectedResult.add("Здоровье, медтехника");

        driver.get("http://oz.by");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class=\"main-nav__list__li main-nav__list__li_wnav\"]")));

        List<WebElement> actualResult = driver.findElements(By.xpath("//li[@class=\"main-nav__list__li main-nav__list__li_wnav\"]"));
        System.out.println(expectedResult.size() + " " + actualResult.size());
        int match = 0;
        for (int i = 0; i < expectedResult.size(); i++){
            if (expectedResult.get(i).equals(actualResult.get(i).getText())){
                match++;
            }
        }
        if(match == expectedResult.size()){
            System.out.println("Filters are similar");
        }
        driver.quit();
    }
}