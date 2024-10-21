package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFWhiteHackerPage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickCardLinkWhiteHacker() {

        //Проверка работы кнопки "Белый хакер"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CardLinkWhiteHacker = webDriver.findElement(By.cssSelector("#HACKER"));

        CardLinkWhiteHacker.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HACKER")));

    }
}
