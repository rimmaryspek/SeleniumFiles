package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        // get the Amazon
        driver.get("https://www.amazon.com");
        // find the element EN
        WebElement enHover = driver.findElement(By.xpath("//div[text()='EN']"));
        //actions class
        Actions action= new Actions(driver);
        // perfirm the element
        action.moveToElement(enHover).perform();



    }
}
