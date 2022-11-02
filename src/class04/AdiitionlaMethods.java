package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdiitionlaMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //        create an instance
        WebDriver driver= new ChromeDriver();
        //        open the syntax
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        // find the webElement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        //        get the text from the btn webelement
        String text = btn.getText();
        //        print it on console
        System.out.println("the text in the button is :"+text);


        //        get the value of the attribute "id" from this WebElement
        String idvalue = btn.getAttribute("id");
        //        print it on the console
        System.out.println("the value of the attribute id is :"+idvalue);


    }
}
