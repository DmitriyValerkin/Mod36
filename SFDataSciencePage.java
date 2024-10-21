package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFDataSciencePage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickDataSciencePage() {

        //Проверка работоспособности кнопки "Data Science" в шапке веб-страницы

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement DataSciencePage = webDriver.findElement(By.xpath("//*[@class='directions__list']//*[text()='Data Science']"));

        DataSciencePage.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='directions__list']//*[text()='Data Science']")));

    }
}
