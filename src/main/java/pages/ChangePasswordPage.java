package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePasswordPage {
    private WebDriver driver;
    private By currentPasswordField = By.name("currentPassword");
    private By newPasswordField = By.name("new_password");
    private By confirmPasswordField = By.name("confirm");
    private By saveButton = By.cssSelector("#page > div:nth-child(2) > div > div > form > div.panel-footer > div > div > button");
    private By confirmationAlert = By.className("toast-table");

    public ChangePasswordPage (WebDriver driver){ this.driver = driver;}

    public void setCurrentPassword(String currentPassword) {driver.findElement(currentPasswordField).sendKeys(currentPassword);}
    public void setNewPassword(String newPassword) {driver.findElement(newPasswordField).sendKeys(newPassword);}
    public void setConfirmPassword(String confirmPassword) {driver.findElement(confirmPasswordField).sendKeys(confirmPassword);}
    public void clickSaveButton(){driver.findElement(saveButton).click();}

    public String getAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationAlert));
        return driver.findElement(confirmationAlert).getText();
        }

}
