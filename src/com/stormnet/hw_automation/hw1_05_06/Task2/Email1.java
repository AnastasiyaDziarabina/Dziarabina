package com.stormnet.hw_automation.hw1_05_06.Task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Email1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Wait<WebDriver> wait = new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mailbox:login']")));
        WebElement login = driver.findElement(By.xpath("//input[@id='mailbox:login']"));
        login.sendKeys("hwautomatization@mail.ru");

        WebElement password = driver.findElement(By.xpath("//input[@class='o-control']"));
        password.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mailbox:password']")));
        WebElement password1 = driver.findElement(By.xpath("//input[@id='mailbox:password']"));
        password1.sendKeys("pwd12345");

        WebElement button = driver.findElement(By.xpath("//label[@id='mailbox:submit']"));
        button.click();

        WebElement check = driver.findElement(By.xpath("//span[contains(text(),'Написать письмо')]"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='llc__item llc__item_correspondent llc__item_unread']")));
        List<WebElement> inbox = driver.findElements(By.xpath("//div[@class='llc__item llc__item_correspondent llc__item_unread']"));
        System.out.println(inbox.size() + " Letter(s) in box ");

        driver.quit();
    }
}