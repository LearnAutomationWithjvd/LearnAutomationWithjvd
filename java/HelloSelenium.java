import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloSelenium {


    @BeforeTest
    public void BeforTest(){
        String path = System.getProperty("user.dir")+"//reports//index.html";


    }

    @Test
    public void FirstTest(){
        //Create driver object

        System.setProperty("webdriver.chrome.driver", "//Users//javmoha//Documents//RestAssured//driver//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }


}
