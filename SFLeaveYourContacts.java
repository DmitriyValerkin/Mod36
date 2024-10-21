package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFLeaveYourContacts {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickLocatorRecordNegativeTest() {

        // Проверка формы "Оставьте контакты, и мы поможем подобрать IT-курс для вашей цели" на заполнение некорректных данных

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Namefield = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[1]/div/input"));

        Namefield.sendKeys("Test");

        WebElement Emailfield = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[2]/div/input"));

        Emailfield.sendKeys("Test");

        WebElement Telephonenumberfield = webDriver.findElement(By.xpath("//*[@id=\"input_1676828667932\"]"));

        Telephonenumberfield.sendKeys("0000000000");

        WebElement Sendbutton = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[5]/button"));

        Sendbutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[5]/button")));

    }
}
