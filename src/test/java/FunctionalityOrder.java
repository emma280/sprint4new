import Page_Object.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalityOrder {
    public static WebDriver driver;


    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\FiefoxWebdriver\\geckodriver.exe");

        driver =  new FirefoxDriver();
    }
    //Заказ самоката по кнопке Заказать рядом с кнопкой Статус заказа (1 набор данных)
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Main main = new Main(driver);
        main.Order("Эмма", "Миронова", "г.Пушкин", "89111234056", "14.07.2022", "Самокат");
        Assertions.assertTrue(driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1, "кнопка посмотреть статус не отобразилась");

    }
    //Заказ самоката по кнопке Заказать рядом с кнопкой Статус заказа (2 набор данных)
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Main main = new Main(driver);
        main.Order("Андрей", "Иванов", "г.Москва ул.Конюшенная д.5", "89111212345", "14.08.2022", "Самокат нужен сегодня");
        Assertions.assertTrue(driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1, "кнопка посмотреть статус не отобразилась");
    }
    //Заказ самоката по кнопке Заказать внизу страницы (1 набор данных)
    @Test
    public void test3() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Main main = new Main(driver);
        main.Order2("Елизавета", "Андреева", "г.Москва ул.Новый Арбат д.5", "89111212346", "12.08.2022", "Самокат нужен срочно");
        Assertions.assertTrue(driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1, "кнопка посмотреть статус не отобразилась");
        //Thread.sleep(8000);
    }

    //Заказ самоката по кнопке Заказать внизу страницы (2 набор данных)
    @Test
    public void test4() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Main main = new Main(driver);
        main.Order2("Никита", "Усачев", "г.Псков ул.Новый Арбат д.5", "89111212348", "12.06.2022", "");
        Assertions.assertTrue(driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1, "кнопка посмотреть статус не отобразилась");
    }


    @AfterEach
    public void tearDown () {

        driver.quit();
    }
}

