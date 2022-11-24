package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeysUsage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        // wait untill element found
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // get the URL
        driver.manage().window().maximize();
        // get URL
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //find the element
        WebElement userName = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]"));
        //sent the text and hit  TAB key
        userName.sendKeys("Tester", Keys.TAB);
        // find the password texbox
        WebElement password = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]"));
        // send the text and hit ENTER
        password.sendKeys("test",Keys.ENTER);



    }
}
