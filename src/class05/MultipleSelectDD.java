package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //        find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        using select class
        Select sel=new Select(DD);

//        By index
        sel.selectByIndex(3);
//        by visible text
        sel.selectByVisibleText("Texas");
        // deselect by index
        Thread.sleep(1000);
        sel.deselectByIndex(3);
        // select all the options in the DD
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i < options.size(); i++) {
            sel.selectByIndex(i);
        }
Thread.sleep(3000);
// deselect all the options
        sel.deselectAll();
        // how to check if the DD multi select or not using selenium
        boolean multiselect = sel.isMultiple();
        System.out.println(multiselect);// on concule you will get true value
    }
}
