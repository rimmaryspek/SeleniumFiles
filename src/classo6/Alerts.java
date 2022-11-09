package classo6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
            //        create an instance
            WebDriver driver= new ChromeDriver();
            driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
       //find the button click me for the alert and click on it
        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]"));
        element.click();

        //handling the alerts
        Thread.sleep(2000);
       Alert simpleAlert = driver.switchTo().alert();
       simpleAlert.accept();// on the popup JS alert we can only get accept method.
// fins the confirmation button and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]"));
        confirmationAlert.click();
        //how to handle this JS alret
        Alert confitmationAlert1 = driver.switchTo().alert();
       confitmationAlert1.dismiss();

//find to promt alert and send text and accept
        WebElement promtAlert = driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]"));
        promtAlert.click();

      /* Alert promtpAlet1 = driver.switchTo().alert();
        promtpAlet1.sendKeys("agagagga");
       promtpAlet1.accept();
*/
        Alert propm1 = driver.switchTo().alert();
        propm1.sendKeys("abracadabra");
        propm1.accept();

        }
    }



