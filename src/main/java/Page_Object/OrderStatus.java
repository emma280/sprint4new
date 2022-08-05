package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class OrderStatus {

    private WebDriver driver;

    public OrderStatus (WebDriver driver){
        this.driver =driver;
    }
    // Локатор для изображения такого заказа нет
    private By imgNoOrder = By.className("Track_NotFound__6oaoY");



    public boolean getOrderNotFound(){
        return driver.findElement(imgNoOrder).isDisplayed();
    }


}
