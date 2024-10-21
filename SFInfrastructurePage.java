package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFInfrastructurePage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void clickOnlineCoursesInfrastructure() {

        //Проверка перехода с кнопки меню "Онлайн курсы" в шапке веб-страницы по выпадающему списку курсов. Курс "Инфраструктура".

        webDriver.navigate().to("https://www.skillfactory.ru");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

        WebElement OnlineCoursesInfrastructure = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

        OnlineCoursesInfrastructure.click();

        OnlineCoursesInfrastructure.sendKeys("Инфраструктура");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Инфраструктура']"))).click();

    }
}
