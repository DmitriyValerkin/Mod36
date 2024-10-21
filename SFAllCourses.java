package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFAllCourses {
    public WebDriver webDriver;
    public WebDriverWait wait;
    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickAllCourses() {

        //Проверка работы кнопки "Все курсы"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement AllCoursesButton = webDriver.findElement(By.className("directions__list-link_green"));

        AllCoursesButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("directions__list-link_green")));

    }
}
