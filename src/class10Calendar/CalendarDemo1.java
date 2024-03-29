package class10Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");
// click on the calendar
        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        //         get the month and check if it is the desried month

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean isFound = false;
        while (!isFound) {
            String monthName = month.getText();

            if (monthName.equalsIgnoreCase("March")) {
//               get all the dates from the table
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
//               traverse through the list to find your desired date
                for (WebElement date : dates) {
                    String currentDate = date.getText();
                    if (currentDate.equalsIgnoreCase("15")) {
                        date.click();
                        break;
                    }
                }
                System.out.println("i have found the desried month :" + monthName);
                isFound = true;
            } else {
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }

        }

    }
}
