package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFDesingPage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickDesingPage() {

        //Проверка работоспособности кнопки "Дизайн" в шапке веб-страницы

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement DesingPage = webDriver.findElement(By.xpath("//*[@class='directions__list']//*[text()='Дизайн']"));

        DesingPage.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='directions__list']//*[text()='Дизайн']")));

    }
}
