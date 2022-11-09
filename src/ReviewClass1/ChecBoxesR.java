package ReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChecBoxesR {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        //     find the checkBoxes
        List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

// what does this list contain?
//        it contains all the 6 Webelements

        for(WebElement checkBx:checkbxes){

            String color = checkBx.getAttribute("value");

            if(color.equalsIgnoreCase("orange")){ // we what to get all value cut off the if condition
                checkBx.click();
                break;
            }

        }

    }
}
