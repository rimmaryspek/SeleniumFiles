package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver") ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        // to find the xpath we need to incpect and select the box and F12 and find the needed.
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abababbaba");
      // click on forgot password with using xpath
        driver.findElement(By.xpath("//a[text()=\"Forgot password?\"]")).click();
        // Xpath to identify by contains method
        //      //a[contains(text(), "Forgot")] for "Forgot password" box

        // Xpath with Starts with method //input[starts-with(@name,"pa")]

        driver.findElement(By.xpath("//button[contains(@type, \"submit\")]")).click();


    }
}
