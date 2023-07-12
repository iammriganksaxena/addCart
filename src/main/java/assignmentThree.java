import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class assignmentThree extends baseclass {

    public static void main(String[] args) throws InterruptedException {

        baseclass baseclass = new baseclass();
        WebDriver driver = baseclass.launchBrowser();
        baseclass.goTOPage(driver, baseclass.urlLoginPagePractise);
        HashMap<String, String> map = baseclass.getUsernameAndPassword(driver);
        baseclass.loginToPage(driver, map.get(baseclass.keyUsername),map.get(baseclass.keyPassword),baseclass.profileNameUser,baseclass.roleConsultant);
        baseclass.addItemsToCart(driver);
    }
}
