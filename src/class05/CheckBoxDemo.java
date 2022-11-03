package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
      driver.findElement(By.id("Click on this check box"));




    }
}
