package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Thread.sleep(100);
        //get the all the link anchartags
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        //print the size all the link
        System.out.println(" all the links " + ebayLinks.size());
        // impleemting for forloop to get all elements
        for (WebElement ebayLink : ebayLinks) {
            String Link = ebayLink.getAttribute("href");
            System.out.println(Link);
        }
    }
}