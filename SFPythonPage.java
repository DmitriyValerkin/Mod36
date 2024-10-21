package ru.sf;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFPythonPage {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
   @Test
    public void clickPythonPage() {

        //Проверка перехода с кнопки меню "Онлайн курсы" в шапке веб-страницы по выпадающему списку курсов. Курс "Python".

        webDriver.navigate().to("https://www.skillfactory.ru");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

        WebElement PythonPage = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

        PythonPage.click();

        PythonPage.sendKeys("Python");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Python']"))).click();

    }

}
