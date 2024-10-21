package ru.sf;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SFTesting {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void clickTesting() {
        //Проверка работы кнопки "Тестирование"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Testing = webDriver.findElement(By.partialLinkText("Тестирование"));

        Testing.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Тестирование")));

    }

   /* @After
    public void closeBrowser() {
        //drive.quit();
        webDriver.quit();
    }*/
}
