package ru.sf;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFMainPage {
    public WebDriver webDriver;
    public WebDriverWait wait;
    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void mainPageTitle() {

        //Проверка совпадения сайта с заглавием

        webDriver.navigate().to("https://www.skillfactory.ru");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("title")));

        String ActualTitle = webDriver.getTitle();

        String ExpectedTitle = "Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям";

        Assert.assertEquals(ExpectedTitle, ActualTitle);

        System.out.println("Test - Title ist verified");

    }
}
