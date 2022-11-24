package Test;

import Pages.loginPage;
import Utils.CommonMethods;

public class loginPageTest {
    public static void main(String[] args) {
        //call the common methods
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //creating an object
        loginPage login = new loginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();

    }
}
