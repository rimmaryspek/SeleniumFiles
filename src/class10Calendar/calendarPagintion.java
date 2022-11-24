package class10Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendarPagintion {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        code to get to the table page
        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        // fill out username
        username.sendKeys("admin");
        // fill the password
        WebElement password = driver.findElement(By.xpath("//input[ @type ='password']"));
        //fill the textboz with password
        password.sendKeys("Hum@nhrm123");

        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();
        //        get all the ids from the columns

        List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        boolean idFound = false;
        while (!idFound) {// we need to get to next page and loop again
            for (int i = 0; i < columnID.size(); i++) {// loop for the first page
//extract the id from the entry in list
                String id = columnID.get(i).getText();
//            check if it is the desired id
                if (id.equalsIgnoreCase("45011A")) {
//                check the checkbox associated with this particular  row
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound = true;
                    break;
                }

            }
            if (!idFound) {// if condition  for the next page to check the ID

                WebElement nextbtd = driver.findElement(By.xpath("//a[text()='Next']"));
                nextbtd.click();
            }
        }
    }

}
