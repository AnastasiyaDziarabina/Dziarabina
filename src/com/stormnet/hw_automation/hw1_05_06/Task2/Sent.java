package com.stormnet.hw_automation.hw1_05_06.Task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Sent {
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

        WebElement submit = driver.findElement(By.xpath("//label[@id='mailbox:submit']"));
        submit.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Написать письмо')]")));
        WebElement check = driver.findElement(By.xpath("//span[contains(text(),'Написать письмо')]"));
        check.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-type='to']/descendant::input[@class='container--H9L5q size_s--3_M-_']")));
        WebElement to = driver.findElement(By.xpath("//div[@data-type='to']/descendant::input[@class='container--H9L5q size_s--3_M-_']"));
        to.click();
        to.sendKeys("hwautomatization@mail.ru");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Subject']")));
        WebElement theme = driver.findElement(By.xpath("//input[@name='Subject']"));
        theme.click();
        theme.sendKeys("homework");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='textbox']")));
        WebElement text = driver.findElement(By.xpath("//div[@role='textbox']"));
        text.sendKeys("hi, there is my automation text");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Отправить']")));
        WebElement send = driver.findElement(By.xpath("//span[@title='Отправить']"));
        send.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='layer__link']")));
        WebElement letter = driver.findElement(By.xpath("//a[@class='layer__link']"));
        letter.click();

        System.out.println(" Your letter is open and read ");
        driver.quit();
    }
}