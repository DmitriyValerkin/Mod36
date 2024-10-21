package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFCoursesIT {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickCoursesIT() {

        //Проверка работы кнопки "Графический дизайнер с нуля до pro"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CoursesIT = webDriver.findElement(By.cssSelector("#GRAPHPRO"));

        CoursesIT.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#GRAPHPRO")));

    }
}
