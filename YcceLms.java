package Pranit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.SliderUI;

public class YcceLms {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jnmc.adcclms.com/login/index.php");
driver.findElement(By.id("username")).sendKeys("manager_pranit");
        driver.findElement(By.id("password")).sendKeys("Pranit@1997");
        driver.findElement(By.id("loginbtn")).click();
        //Actions action = new Actions(driver);
        //WebElement scroll = driver.findElement(By.className("os-content"));
        //action.moveToElement(scroll).build().perform();
        driver.findElement(By.xpath("//*[@id=\"course-info-container-2-8\"]/a/span[3]")).click();

    }}