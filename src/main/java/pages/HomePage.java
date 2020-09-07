package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By userMenuButton = By.className("avatar-picture");
    private By passwordOption= By.cssSelector("#main-menu > ul > li.dropdown.no-hover.open > ul > li:nth-child(3) > a");
    public HomePage(WebDriver driver)  {
        this.driver = driver;
    }
    public void clickMenuButton() { driver.findElement(userMenuButton).click(); }

   public ChangePasswordPage SelectPasswordOption(){
       driver.findElement(passwordOption).click();
        return new ChangePasswordPage(driver);
    }

}
