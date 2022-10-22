package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
// set the path tho the driver to link
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver") ;

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String  url=driver.getCurrentUrl();
        System.out.println(url);
        String  title= driver.getTitle();
        System.out.println(title);
        driver.quit();
       // driver.close();

    }
}
