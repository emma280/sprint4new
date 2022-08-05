import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldsError {
    public static WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }
    // Проверка ошибок для всех полей формы заказа

    // Проверка ошибки поля Имя
    @Test
    public void test9() throws InterruptedException {

        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("sff");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//*[text()='Введите корректное имя']")).getText()
                .contains("Введите корректное имя"));
    }
    // Проверка ошибки поля Фамилия
    @Test
    public void test10() throws InterruptedException {

        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("fkdog");
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Введите корректную фамилию']")).getText()
                .contains("Введите корректную фамилию"));
    }
    // Проверка ошибки поля Адрес
    @Test
    public void test11() throws InterruptedException {

        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"))
                .sendKeys("впв");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Введите корректный адрес']")).getText()
                .contains("Введите корректный адрес"));
    }

    // Проверка ошибки поля Станция метро
    @Test
    public void test12() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("Эмма");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("Миронова");
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"))
                .sendKeys("г. Санкт-Петербург, ул. Конюшенная д.10");

        driver.findElement(By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"))
                .sendKeys("89213333333");
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Выберите станцию']")).getText()
                .contains("Выберите станцию"));
    }
    // Проверка ошибки поля Станция метро
    @Test
    public void test13() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("Эмма");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("Миронова");
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"))
                .sendKeys("г. Санкт-Петербург, ул. Конюшенная д.10");
        driver.findElement(By.xpath("//input[@placeholder='* Станция метро']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']")).click();

        driver.findElement(By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"))
                .sendKeys("ыаы");
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Введите корректный номер']")).getText()
                .contains("Введите корректный номер"));
    }


    @AfterEach
    public void tearDown () {
        driver.quit();
    }
}