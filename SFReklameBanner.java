package ru.sf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFReklameBanner {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void clickNegativTestBanner() {

        //Проверка работы рекламного баннера без заполнения необходимых личных данных
        //Не закрывает баннер после прохождения негативного сценария.

        webDriver.navigate().to("https://skillfactory.ru");

        WebElement Buttontsubmit = webDriver.findElement(By.className("tn-elem__8114159181722593034290"));

        Buttontsubmit.click();

        WebElement Buttonsubmit1 = webDriver.findElement(By.className("t-form__submit"));

        Buttonsubmit1.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t-submit']//*[text()='Записаться']")));

        //WebElement close = webDriver.findElement(By.xpath("//*[@class='t-popup__block-close-button']//*[text()='Закрыть диалоговое окно']"));

        WebElement close = this.webDriver.findElement(By.className("t-popup__close-icon"));

        close.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t-popup__close-icon")));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rec811415971\"]/div/div/div[1]/button")));

    }
}
