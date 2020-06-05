package com.stormnet.hw_automation.hw1_05_06.lesson0206.Tes1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://oz.by/");

        WebElement basket = driver.findElement(By.xpath("//a[@class=\"top-panel__userbar__cart__item\"]"));
        basket.click();
        WebElement text = driver.findElement(By.xpath("//div[@class=\"i-textual i-textual_bordered\"]"));

        driver.navigate().back();
        WebElement search = driver.findElement(By.xpath("//input[@id=\"top-s\"]"));
        search.sendKeys("Программирование");
        driver.findElement(By.xpath("//button[@onclick=\"this.blur();\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"goods-table\"]/li[1]/div")).click();
        driver.findElement(By.xpath("//button[(@type=\"submit\") and contains(@class,\"b-product-control__button i-button i-button_large i-button_orange addtocart-btn first-button\")]")).click();
        driver.findElement(By.xpath("//a[(@href=\"/checkout/\") and contains(@class,\"top-panel__userbar__cart__item\")]")).click();

        WebElement result = driver.findElement(By.xpath("//a[(@class=\"goods-table-cell__line goods-table-cell__line_title\") and contains(text(),\"Программирование\")]"));
    }
}