import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingQuestions {
    public static WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }
// Проверки выпадающего списка "Вопросы о важном"

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-0")).click();

        //Assertions.assertTrue(driver.findElement(textLocator1).isDisplayed());
        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-0'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-0'] p")).getText()
                .contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-1")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-1'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-1'] p")).getText()
                .contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
        Thread.sleep(3000);

    }
    @Test
    public void test3() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-2")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-2'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-2'] p")).getText()
                .contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        //Thread.sleep(3000);

    }
    @Test
    public void test4() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-3")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-3'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-3'] p")).getText()
                .contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        //Thread.sleep(3000);

    }

    @Test
    public void test5() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-4")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-4'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-4'] p")).getText()
                .contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        //Thread.sleep(3000);

    }

    @Test
    public void test6() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-5")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-5'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-5'] p")).getText()
                .contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        //Thread.sleep(3000);
    }

    @Test
    public void test7() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-6")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-6'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-6'] p")).getText()
                .contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        //Thread.sleep(3000);
    }

    @Test
    public void test8() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-7")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-7'] p")).isDisplayed());
        Assertions.assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-7'] p")).getText()
                .contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
        //Thread.sleep(3000);
    }

        @AfterEach
        public void tearDown () {
            driver.quit();
        }
    }
