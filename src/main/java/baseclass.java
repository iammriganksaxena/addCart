import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;

public class baseclass {

    public String urlAngularPractise="https://rahulshettyacademy.com/angularpractice/";
    public String urlLoginPagePractise = "https://rahulshettyacademy.com/loginpagePractise/";
    public String urlSeleniumPractise = "https://rahulshettyacademy.com/seleniumPractise/";
    public String profileNameAdmin = "Admin";
    public String profileNameUser = "User";
    public String roleStudent = "Student";
    public String roleTeacher = "Teacher";
    public String roleConsultant = "Consultant";
    public String keyUsername = "USERNAME";
    public String keyPassword = "PASSWORD";



    public WebDriver launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriverWait waitFor(WebDriver driver, int seconds, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        return wait;
    }

    public void goTOPage(WebDriver driver, String URL){
        driver.get(URL);
    }

    public HashMap<String, String> getUsernameAndPassword(WebDriver driver){
        List<WebElement> creds = driver.findElements(By.cssSelector("p.text-center i"));
        String username = creds.get(0).getText();
        String password = creds.get(1).getText();
        HashMap<String, String> map = new HashMap<>();
        map.put("USERNAME", username);
        map.put("PASSWORD", password);
        return map;
    }

    public void loginToPage(WebDriver driver, String username, String password, String profileName, String role) throws InterruptedException {
        driver.findElement(By.cssSelector("input#username")).sendKeys(username);
        driver.findElement(By.cssSelector("input#password")).sendKeys(password);
        List<WebElement> profile = driver.findElements(By.cssSelector("span.radiotextsty"));
        String Admin = profile.get(0).getText();
        String User = profile.get(1).getText();
        if(profileName.contains(User)){
            driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        }else {
            driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
        }
        waitFor(driver, 5,driver.findElement(By.xpath("//button[text()='Okay']")));
        Actions act= new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//button[text()='Okay']"))).click().build().perform();
        List<WebElement> Role = driver.findElements(By.cssSelector("select.form-control option"));
        String student = Role.get(0).getText();
        String teacher = Role.get(1).getText();
        String consultant = Role.get(2).getText();
        if(role.contains(student)){
            Role.get(0).click();
        }if(role.contains(teacher)){
            Role.get(1).click();
        }else {
            Role.get(2).click();
        }
        driver.findElement(By.cssSelector("input#terms")).click();
        driver.findElement(By.cssSelector("input#signInBtn")).click();
    }

    public void addItemsToCart(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        List<WebElement> items = driver.findElements(By.xpath("//button[text()='Add ']"));
        for(int i=0;i<items.size();i++){
            items.get(i).click();
        }
        driver.findElement(By.xpath("//a[contains(text(), 'Checkout ')]")).click();
    }
}
