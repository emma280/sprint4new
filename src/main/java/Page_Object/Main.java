package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//*
public class Main {
    private WebDriver driver;
    //локатор кнопки куки
    private By buttonCookie = By.id("rcc-confirm-button");
    //локатор для кнопки "Заказать" вверху страницы
    private By buttonOrder = By.xpath(".//button[@class='Button_Button__ra12g']");

    // локатор для кнопки заказать внизу страницы
    private By buttonOrder3 = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // локатор для поля "Имя"
    private By name = By.xpath("//input[@placeholder='* Имя']");
    //локатор для поля "Фамилия"
    private By surname = By.xpath("//input[@placeholder='* Фамилия']");
    //локатор для поля "Адрес"
    private By address =By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор для поля "Станция метро"
    private By metro =By.xpath("//input[@placeholder='* Станция метро']");

    //локатор для выбора станции
    private By metroboulevard = (By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']"));
    //локатор для поля "Телефон"
    private By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор для кнопки "Далее"
    private By buttonThen = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //локатор для поля Когда привезти самокат
    private By date =(By.xpath("//input[@placeholder='* Когда привезти самокат']"));

    //локатор для поля Про аренду
    private By blanckpole =(By.xpath("//*[text() = 'Про аренду']"));

    //локатор для поля Срок аренды
    private By rentalperiod = (By.xpath("//*[@class='Dropdown-control']"));


    private By day = (By.xpath("//*[text() = 'сутки']"));

    //локатор для поля Цвет Самоката
    private By scootercolor = (By.id("black"));


    //локатор для поля Комментарий
    private By comment = (By.xpath("//input[@placeholder='Комментарий для курьера']"));

    //локатор для кнопки заказать
    private By buttonOrder2 = (By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));

    //Локатор для кнопки да
    private By buttonyes = (By.xpath("//*[text() = 'Да']"));


    // локатор для кнопки "Статус заказа//
    private By buttonOrderStatus = (By.xpath("//button[@class='Header_Link__1TAG7']"));

    //локатор для поля ввода номера заказа
    private By orderNumber = (By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']"));

    // локатор для кнопки "GO"
    private By buttonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    public Main(WebDriver driver) {
        this.driver = driver;
    }


    public  void  setButtonCookie(){
        driver.findElement(buttonCookie).click();
    }

    public  void setButtonOrder(){
        driver.findElement(buttonOrder).click();
    }

    public  void setButtonOrder3(){
        driver.findElement(buttonOrder3).click();
    }

    public  void setName(String nameEnter){
        driver.findElement(name).sendKeys(nameEnter);
    }

    public  void setSurname(String surnameEnter){
        driver.findElement(surname).sendKeys(surnameEnter);
    }
    public  void setAddress(String addressEnter){
        driver.findElement(address).sendKeys(addressEnter);
    }
    public  void setMetro(){
        driver.findElement(metro).sendKeys(Keys.ARROW_DOWN);
    }

    public  void setMetro2(){

        driver.findElement(metroboulevard).click();
    }

    public  void setPhone(String phoneEnter){
        driver.findElement(phone).sendKeys(phoneEnter);
    }

    public void setButtonThen(){
       driver.findElement(buttonThen).click();
    }

    public void setDate(String dateEnter){
        driver.findElement(date).sendKeys(dateEnter);
    }

    public void setBlanckpole(){
        driver.findElement(blanckpole).click();
    }

    public void setRentalperiod(){
        driver.findElement(rentalperiod).click();
    }
    public void setDay(){
        driver.findElement(day).click();
    }

    public void setScootercolor(){
        driver.findElement(scootercolor).click();
    }
    public void setComment(String commentEnter){
        driver.findElement(comment).sendKeys(commentEnter);
    }
    public void setButtonOrder2(){
        driver.findElement(buttonOrder2).click();
    }

    public void setButtonyes(){
        driver.findElement(buttonyes).click();
    }


    // методы для поля Номер заказа
    public void setButtonOrderStatus() {
        driver.findElement(buttonOrderStatus).click();
    }
    public void setOrderNumber(int orderNumberEnter) {
        driver.findElement(orderNumber).sendKeys();
    }
    public void setButtonGO() {
        driver.findElement(buttonGO).click();
    }



    public void Order(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter){
        setButtonCookie();
        setButtonOrder();
        setName(nameEnter);
        setSurname(surnameEnter);
        setAddress(addressEnter);
        setMetro();
        setMetro2();
        setPhone(phoneEnter);
        setButtonThen();
        setDate(dateEnter);
        setBlanckpole();
        setRentalperiod();
        setDay();
        setScootercolor();
        setComment(commentEnter);
        setButtonOrder2();
        setButtonyes();
    }
    public void Order2(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter){
        setButtonCookie();
        setButtonOrder3();
        setName(nameEnter);
        setSurname(surnameEnter);
        setAddress(addressEnter);
        setMetro();
        setMetro2();
        setPhone(phoneEnter);
        setButtonThen();
        setDate(dateEnter);
        setBlanckpole();
        setRentalperiod();
        setDay();
        setScootercolor();
        setComment(commentEnter);
        setButtonOrder2();
        setButtonyes();
    }



}

