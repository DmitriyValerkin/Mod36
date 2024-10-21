package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFOnlineCourses {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickOnlineCourses() {

        //Проверка работоспособности кнопки меню "Онлайн курсы" в шапке веб-страницы с выпадающим списком

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement OnlineCourses = webDriver.findElement(By.className("t978__tm-link"));

        OnlineCourses.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t978__tm-link")));

    }

}
