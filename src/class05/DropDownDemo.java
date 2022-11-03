package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //fins the web-element  dropdown by looking for select tag
        WebElement dropdawn = driver.findElement(By.xpath(" //select[@id='select-demo']"));
        // use select class and creating an object
        Select select =new Select(dropdawn);// variable
       //select an option to get "specific element"
        select.selectByIndex(5);
// select by visible text and give time to explare
        Thread.sleep(3000);
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
        select.selectByValue("Sunday");
        // get all the options available in the dropdown

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);
            System.out.println( option.getText());
            // to get the just ont text we are creating a var to assing the text that we need
            String text= option.getText();
            if (text.equalsIgnoreCase("Friday")){//to get the "friday"
                select.selectByIndex(i);
            }

        }

    }
}
