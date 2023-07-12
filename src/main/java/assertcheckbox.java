import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class assertcheckbox{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


       //Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected());
        //System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected());

        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Shubham");
        //System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected());
        //Assert.assertTrue(driver.findElement(By.xpath("(//label//input[@type='checkbox'])[1]")).isSelected());

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@abc.com");
        //System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected());
        //Assert.assertFalse(driver.findElement(By.xpath("(//label//input[@type='checkbox'])[1]")).isSelected());
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@type='radio' and @value='option1']")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("20/05/1995");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        System.out.println(driver.findElement(By.xpath("//a[@class='close']/parent::div")).getText());
        if((driver.findElement(By.xpath("//a[@class='close']/parent::div")).getText()).equals("×\n" +
                "Success! The Form has been submitted successfully!.")){
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
