import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ImageChk{
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "//Users//javmoha//Documents//RestAssured//driver//chromedriver");
     //   WebDriver driver = new ChromeDriver();
        WebDriver driver = new HtmlUnitDriver(BrowserVersion.EDGE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String url = "https://www.javatpoint.com/";
        driver.get(url);
        //identify image
        WebElement i = driver.findElement
                (By.xpath("//div/a/img[@alt='Javatpoint Logo']"));
        // Javascript executor to check image
        Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete "
                + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                + "&& arguments[0].naturalWidth > 0", i);

        //verify if status is true
        if (p) {
            System.out.println("Logo present");
        } else {
            System.out.println("Logo not present");
        }
        driver.quit();
    }
}