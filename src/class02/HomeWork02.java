package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver") ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //maximizi the window
        driver.manage().window().maximize();
        driver.findElement(By.linkText("open-registration-form-button")).click();
        driver.findElement(By.name("email")).sendKeys("Rimma@gmai");
        driver.findElement(By.name("pass")).sendKeys("123asc");
        driver.findElement(By.name("login")).click();
        driver.quit();


    }
}
