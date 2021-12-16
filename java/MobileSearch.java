import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.*;

public class MobileSearch {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "//Users//javmoha//Documents//RestAssured//driver//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss_2");
        driver.findElement(By.xpath("//*[@id=\'icp-nav-flyout\']/span/span[2]/span[1]")).click();
        /*Actions actions = new Actions(driver);
        actions.moveToElement(ele).click();
*/
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'customer-preferences\']/div/div/form/div/div/div/div/label"));
        String name;
        for (WebElement webElement : list) {
            name = webElement.getText();
            System.out.println(name);


        }






        driver.quit();
    }
}
