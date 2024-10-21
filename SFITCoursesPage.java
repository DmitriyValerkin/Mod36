package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFITCoursesPage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickITCoursesPage() {

        //Проверка работы кнопки "Курсы IT с нуля до PRO"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement ITCourses = webDriver.findElement(By.cssSelector("#START"));

        ITCourses.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#START")));

    }
}
