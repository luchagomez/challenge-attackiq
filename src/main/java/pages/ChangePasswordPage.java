package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    private WebDriver driver;
    private By currentPasswordField = By.name("currentPassword");
    private By newPasswordField = By.name("new_password");
    private By confirmPasswordField = By.name("confirm");
    private By saveButton = By.className("btn-block");
    private By confirmationAlert = By.className("toast-table");

    public ChangePasswordPage (WebDriver driver){ this.driver = driver;}

    public void setCurrentPassword(String currentPassword) {driver.findElement(currentPasswordField).sendKeys(currentPassword);}
    public void setNewPassword(String newPassword) {driver.findElement(newPasswordField).sendKeys(newPassword);}
    public void setConfirmPassword(String confirmPassword) {driver.findElement(confirmPasswordField).sendKeys(confirmPassword);}
    public void clickSaveButton(){driver.findElement(saveButton).click();}

    public String getAlertText() {return driver.findElement(confirmationAlert).getText();}

}
