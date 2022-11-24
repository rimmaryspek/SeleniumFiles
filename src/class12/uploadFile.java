package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        // get the Amazon
        driver.get("\"https://the-internet.herokuapp.com/upload%22");

        WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
      //  choosefile.sendKeys("C/Users/rimmaryspek/Desktop\syntaxbatch14.txt");
    }
}
