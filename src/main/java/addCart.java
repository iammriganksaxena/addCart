import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class addCart {

    @Test
    public static void main(String[] args) throws InterruptedException {

        String[] searchItems = {"Carrot", "Cauliflower", "Beetroot"};

        WebDriver driver = launchBrowserAndNavigateTo();
        addItemsToCart(searchItems,driver);
        clickToProceed(driver);
        quitDriver(driver);

        }

        public static void addItemsToCart(String[] searchItems, WebDriver driver) throws InterruptedException {

            List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
            String[] item = new String[products.size()];
            String[] eachProd;

            for(int i=0,j=0;i<products.size();i++,j++) {
                item[j] = products.get(i).getText();
            }

            for(String searchItem: searchItems) {
                for (int i = 0; i < products.size(); i++) {
                    eachProd = item[i].split("-");
                    String newEachProd = eachProd[0].trim();
                    if (newEachProd.contains(searchItem)) {
                        Thread.sleep(2000);
                        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                    }
                }
            }

        }

        @AfterTest
        public static void quitDriver(WebDriver driver){
            System.out.println("Test Passed");
            driver.quit();
        }

        @BeforeTest
        public static WebDriver launchBrowserAndNavigateTo(){

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/");
            return driver;
        }

        public static void clickToProceed(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        String msg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
        System.out.println(msg);
        Assert.assertEquals(msg,"Code applied ..!");
        }
    }
