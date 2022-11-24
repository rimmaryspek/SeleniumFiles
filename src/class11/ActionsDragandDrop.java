package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsDragandDrop {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
            WebDriver driver=new ChromeDriver();
            // wait untill element found
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // get the URL
            driver.manage().window().maximize();
            // get URL
            driver.get("https://jqueryui.com/droppable/");
            // switch the focus to the  iframe
            driver.switchTo().frame(0);
            //find the draggable element
            WebElement dragbleElement = driver.findElement(By.xpath("//div[@id='draggable']"));
            // find the droppable element
            WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
            // caling Actions class to perform
        Actions actions = new Actions(driver);
        //dragging the element to droppable
      //  actions.dragAndDrop(dropElement,dragbleElement).perform();
        // Anather way to perform the drag and drop
        actions.clickAndHold(dragbleElement).moveToElement(dropElement).release().build().perform();




    }
}
