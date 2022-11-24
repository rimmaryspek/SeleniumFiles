package class07Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindaowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        //
        String gmailHandle = driver.getWindowHandle();
        //print
        System.out.println("the carrent page is"+gmailHandle);
    }
}
