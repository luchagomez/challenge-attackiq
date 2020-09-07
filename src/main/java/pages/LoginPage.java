package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("id_username");
    private By loginButton = By.id("login_btn");
    private By passwordField = By.id("id_password");
    private By invalidLoginMessage = By.cssSelector("#loginform > p");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername (String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void clickContinueButton (){
        driver.findElement(loginButton).click();
    }
    public void setPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickLoginButton (){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public String getInvalidLoginText() { return driver.findElement(invalidLoginMessage).getText();}
}
