package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC01 {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_CjwKCAjwxY-3BhAuEiwAu7Y6s10YeIJpk4jnxGLsZI598RwBvPAUSTMXS_rUQHIn2E3X2ncsko6lCxoCbkwQAvD_BwE_k_");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
        signIn.click();

        WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
        Username.sendKeys("rahulbhavsarkh@gmail.com");
        driver.findElement(By.xpath("//span[@id='continue']")).click();

        WebElement Password = driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
        Password.sendKeys("Asd@123");


        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("a-autoid-1-announce")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("nav-cart")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTIyOUlWUDJSM1dPNEc&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']")).click();
        driver.findElement(By.xpath("//input[@class='a-input-text a-form-normal no-prefetch-on-change']")).sendKeys("7899692027@ybl");
        driver.findElement(By.xpath("//span[@class='a-button a-button-primary validateVpaButtonSelector']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.quit();
        //driver.close();
    }
}
