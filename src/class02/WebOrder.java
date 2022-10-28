package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
       driver.findElement(By.className("button")).click();
       String title = driver.getTitle();
       if(title.equalsIgnoreCase(" Web Orders")) {
           System.out.println("The tilte is correct" + title);
       }else {
           System.out.println("the tilte is no correct:" + title);
       }


    }
}
