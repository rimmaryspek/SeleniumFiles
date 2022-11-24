package class08WaitsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
      //  WebElement butto1 = driver.findElement(By.xpath("//button[@id=\"populate-text\"]"));
      //  butto1.click();
//        get the text Selenium WebDriver
       // WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
//        print out text on the screen
      //  System.out.println(webDriverText.getText());

//task2 click the button wait 10 sec
      //  WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));

      //  WebDriverWait wait = new WebDriverWait(driver,20);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//button[@id='hidden']")));
     //   WebElement visiblBtn = driver.findElement(By.id("\"//button[@id='hidden']\")"));
      //  visiblBtn.click();
// Task2
//        click on the button "display text after 10 seconds"
        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();

//        as the button appears up after some time so in order to click it or get text from
//         it we need to define some explicit wait

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));


        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();





    }

}
