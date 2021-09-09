package Pranit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.SliderUI;
import java.io.IOException;

public class YcceLms {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ycce.adcclms.com/");
driver.findElement(By.name("email")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div[3]/div[2]/div[1]/div/form[1]/input")).click();
        driver.navigate().to("https://ycce.adcclms.com/files");
        driver.findElement(By.className("btn btn-primary btn-block")).click();
        /*JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.className("btn btn-primary btn-block"));
        js.executeScript("arguments[0].click();",button);

        Runtime.getRuntime().exec("C:\\Users\\Academy\\Desktop\\AutoIt_x64.exe");
       /* Actions click = new Actions(driver);
       WebElement course =  driver.findElement(By.className("collapsible"));
        click.moveToElement(course).build().perform();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Private Files')]")).click();
         driver.findElement(By.xpath("//span[contains(text(),'Courses')]")).click();
        driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/a[1]/div[1]/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("1")).click();
        driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]")).click();
        Thread.sleep(5000);*///*[@id="gatsby-focus-wrapper"]/div/div/div[2]/div/form/div[2]/button
    }}