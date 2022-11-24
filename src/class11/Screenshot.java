package class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot {
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

        //takescreenshot
        TakesScreenshot ss = (TakesScreenshot)driver;
        //screenshot is taken at this point
        File sourseFile = ss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourseFile,new File("screenshots/SmartBear/adminLogin.png"));
        } catch (IOException e) {
            System.out.println("all good");
        }
//after running this code pls check the SEL projet and new folder under name of screenshot (same class name)

        
    }
}
