package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {
        // go to google.com and maximize the page
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver") ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();// maximising the window
        driver.manage().window().fullscreen();
        driver.quit();
    }
}
