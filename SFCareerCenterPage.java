package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFCareerCenterPage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickCareerCenter() {

        //Проверка перехода с кнопки меню "Центр карьеры" в шапке веб-страницы.

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CareerCenter = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='центр карьеры']"));

        CareerCenter.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='центр карьеры']")));

    }
}
