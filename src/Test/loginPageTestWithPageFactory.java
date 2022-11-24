package Test;

import Pages.loginPageWithPageFactory;
import Utils.CommonMethods;

import static Utils.CommonMethods.driver;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPageWithPageFactory login = new loginPageWithPageFactory();
        login.userNamefild.sendKeys("Admin");
        login.passwordfild.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
    public static void closeBrowser() {
        driver.quit();
    }
}
