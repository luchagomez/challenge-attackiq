package changePassword;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.ChangePasswordPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class ChangePasswordTests extends BaseTests {

    @Test
    public void testSuccessfulPasswordChange(){

        loginPage.setUsername("qa02@challenge.org");
        loginPage.clickContinueButton();
        String currentPass = "testChallenge20";
        String newPass= "testChallenge02";

        loginPage.setPassword(currentPass);
        HomePage homePage = loginPage.clickLoginButton();
        homePage.clickMenuButton();
        ChangePasswordPage changePasswordPage = homePage.SelectPasswordOption();
        changePasswordPage.setCurrentPassword(currentPass);
        changePasswordPage.setNewPassword(newPass);
        changePasswordPage.setConfirmPassword(newPass);
        changePasswordPage.clickSaveButton();
        System.out.println(changePasswordPage.getAlertText());
        assertTrue(changePasswordPage.getAlertText()
            .contains("Operation completed successfully."),
                "Alert text incorrect");
     }
    }
