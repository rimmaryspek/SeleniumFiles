package class12;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecuterScroll {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        // wait untill element found
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // get the URL
        driver.manage().window().maximize();
        // get URL
        driver.get("https://www.amazon.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");// start from index 0 to 500 and scroll down
        js.executeScript("window.scrollBy(0,-500)");// scroll up back


    }
}