package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFLeaveYourContactsDouble {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickLocatorRecordNegativeTestDouble() {

        /* Тест перестал работать после появления рекламного банера */

        //При попытки использовать другие локаторы (name, className и т.д.) и методы к ним не увенчались успехом. В исправлении падения теста. */

// Проверка формы записи "Оставьте контакты, и мы поможем подобрать IT-курс для вашей цели" на заполнение некорректных личных данных

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Namefield = webDriver.findElement(By.name("name"));

        Namefield.sendKeys("Test");

        WebElement Emailfield = webDriver.findElement(By.name("email"));

        Emailfield.sendKeys("Test");

        WebElement Telephonenumberfield = webDriver.findElement(By.name("tildaspec-phone-part[]"));

        Telephonenumberfield.sendKeys("0000000000");

        WebElement Sendbutton = webDriver.findElement(By.className("t-submit"));

        Sendbutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t-submit")));
    }
}
