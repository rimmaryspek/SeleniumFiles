package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        // go to google.com and fb.com then google.com
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver") ;
        // create the webdriver instance
        WebDriver driver = new ChromeDriver();
        // go to google
        driver.get("https://www.google.com/");
       // navigate to fb
        driver.navigate().to("https://www.facebook.com/");
        // pause for 2000 mill sec = (2 sec)
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);// wait for 3 seconds
        driver.navigate().forward();// go back to facebook
        Thread.sleep(1000);
        driver.navigate().refresh();// to refresh
        driver.quit();

    }
}
