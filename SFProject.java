package ru.sf;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFProject {
    public WebDriver webDriver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        //  путь к драйверу ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\SFProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
        @Test
        public void clickTesting() {
            //Проверка работы кнопки "Тестирование"

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement Testing = webDriver.findElement(By.partialLinkText("Тестирование"));

            Testing.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Тестирование")));

        }
    @Test
    public void clickAllCourses() {

        //Проверка работы кнопки "Все курсы"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement AllCoursesButton = webDriver.findElement(By.className("directions__list-link_green"));

        AllCoursesButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("directions__list-link_green")));

    }
    @Test
    public void clickPrograming() {

        //Проверка работы кнопки "Программирование"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Programing = webDriver.findElement(By.partialLinkText("Программирование"));

        Programing.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Программирование")));

    }
    @Test
    public void clickCareerCenter() {

        //Проверка перехода с кнопки меню "Центр карьеры" в шапке веб-страницы.

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CareerCenter = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='центр карьеры']"));

        CareerCenter.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='центр карьеры']")));

    }
    @Test
    public void clickContacts() {

        //Проверка работоспособности кнопки "Контакты" в шапке веб-страницы

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Contacts = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='контакты']"));

        Contacts.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='контакты']")));

    }
    @Test
    public void clickCorpCourses() {

        //Проверка перехода с кнопки меню "Корпоративное обучение" в шапке веб-страницы.

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CorpCourses = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='корпоративное обучение']"));

        CorpCourses.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='корпоративное обучение']")));

    }
    @Test
    public void clickCoursesDesignPage() {

        //Проверка работы кнопки "Курсы UX/UI дизайнер с нуля до Pro"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CoursesDesignPage = webDriver.findElement(By.cssSelector("#UXSPRO"));

        CoursesDesignPage.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#UXSPRO")));

    }
    @Test
    public void clickCoursesIT() {

        //Проверка работы кнопки "Графический дизайнер с нуля до pro"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CoursesIT = webDriver.findElement(By.cssSelector("#GRAPHPRO"));

        CoursesIT.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#GRAPHPRO")));

    }
    @Test
    public void clickDataSciencePage() {

        //Проверка работоспособности кнопки "Data Science" в шапке веб-страницы

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement DataSciencePage = webDriver.findElement(By.xpath("//*[@class='directions__list']//*[text()='Data Science']"));

        DataSciencePage.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='directions__list']//*[text()='Data Science']")));

    }
    @Test
    public void clickDesingPage() {

        //Проверка работоспособности кнопки "Дизайн" в шапке веб-страницы

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement DesingPage = webDriver.findElement(By.xpath("//*[@class='directions__list']//*[text()='Дизайн']"));

        DesingPage.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='directions__list']//*[text()='Дизайн']")));

    }
    @Test
    public void clickFreeEvents() {

        //Проверка перехода с кнопки меню "Бесплатно" в шапке веб-страницы.

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement FreeEvents = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='БЕСПЛАТНО']"));

        FreeEvents.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='БЕСПЛАТНО']")));

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
    @Test
    public void clickITCoursesPage() {

        //Проверка работы кнопки "Курсы IT с нуля до PRO"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement ITCourses = webDriver.findElement(By.cssSelector("#START"));

        ITCourses.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#START")));

    }
    @Test
    public void mainPageTitle() {

        //Проверка совпадения сайта с заглавием

        webDriver.navigate().to("https://www.skillfactory.ru");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("title")));

        String ActualTitle = webDriver.getTitle();

        String ExpectedTitle = "Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям";

        Assert.assertEquals(ExpectedTitle, ActualTitle);

        System.out.println("Test - Title ist verified");

    }
    @Test
    public void clickManagementPage() {

        //Проверка работоспособности кнопки "Менеджмент" в шапке веб-страницы

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement ManagementPage = webDriver.findElement(By.xpath("//*[@class='directions__list']//*[text()='Менеджмент']"));

        ManagementPage.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='directions__list']//*[text()='Менеджмент']")));

    }
    @Test
    public void clickBlog() {

        //Проверка перехода с кнопки меню "Медиа" в шапке веб-страницы.

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Blog = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='Медиа']"));

        Blog.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='Медиа']")));

    }
    @Test
    public void clickOnlineCourses() {

        //Проверка работоспособности кнопки меню "Онлайн курсы" в шапке веб-страницы с выпадающим списком

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement OnlineCourses = webDriver.findElement(By.className("t978__tm-link"));

        OnlineCourses.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t978__tm-link")));

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

        WebElement close = this.webDriver.findElement(By.className("t-popup__close-icon"));

        close.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t-popup__close-icon")));

    }
    @Test
    public void clickCardLinkWhiteHacker() {

        //Проверка работы кнопки "Белый хакер"

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CardLinkWhiteHacker = webDriver.findElement(By.cssSelector("#HACKER"));

        CardLinkWhiteHacker.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HACKER")));

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
