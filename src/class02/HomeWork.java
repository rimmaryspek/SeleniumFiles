package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Rimma");
        driver.findElement(By.id("customer.lastName")).sendKeys("Ryspek");
        driver.findElement(By.id("customer.address.street")).sendKeys("2125 Lake Debra Drive");
        driver.findElement(By.id("customer.address.city")).sendKeys("Orlando");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("32835");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("917-770-7318");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        driver.findElement(By.id("customer.username")).sendKeys("RR");
        driver.findElement(By.id("customer.password")).sendKeys("Selen123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Selen123");
        driver.findElement(By.linkText("Register")).click();
        driver.quit();










    }

}
