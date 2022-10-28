package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver") ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //maximizi the window
        driver.manage().window().maximize();
        //enter the username
        //1. lacate the element and send the keys(words or username);
        driver.findElement(By.id("email")).sendKeys("gagagagga");
        // enter the password in the texbox
        driver.findElement(By.id("pass")).sendKeys("passabc");

    // click the log in button
        driver.findElement(By.name("login")).click();

        // task 2------- click on forgot password
     //   driver.findElement(By.linkText("Forgot password?")).click();

     //   task 3------- click on forgot password using Partial Linktext locator
      //  driver.findElement(By.partialLinkText("Forgot")).click();

//DUPLICATE VALUES OF ATTRIBUTES
        //it will take the fisrt code and execute/TAP TO BOTTON.

    }
}
