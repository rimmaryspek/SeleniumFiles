package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DemoSite {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
            WebDriver driver=new ChromeDriver();
            // wait untill element found
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // get the URL
            driver.manage().window().maximize();
            // get URL
            driver.get("https://demo.guru99.com/test/simple_context_menu.html");
            WebElement click = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
            Actions actions = new Actions(driver);
            actions.contextClick(click).perform();
    }
}
