import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulFlight {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//javmoha//Documents//RestAssured//driver//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']")).click();




        WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select sel = new Select(element);
        sel.selectByVisibleText("INR");
        System.out.println(sel.getFirstSelectedOption().getText());
        sel.selectByIndex(2);
        System.out.println(sel.getFirstSelectedOption().getText());
        sel.selectByValue("USD");
        System.out.println(sel.getFirstSelectedOption().getText());



        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1 ; i<=5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();


    }
}