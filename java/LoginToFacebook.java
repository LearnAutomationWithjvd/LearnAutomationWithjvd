import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LoginToFacebook {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//javmoha//Documents//RestAssured//driver//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.makemytrip.com/");


        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("DELHI");
        List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for (WebElement webElement : list1) {
           if(webElement.getText()== "DEL")
            webElement.click();

            }

        driver.findElement(By.cssSelector("input#toCity")).sendKeys("Mumbai");
        List<WebElement> list2 = driver.findElements(By.xpath("//ul[@role='listbox']"));
        for (WebElement webElement : list2) {
            if(webElement.getText()== "BOM")
                webElement.click();
            Thread.sleep(2000);
            }
/*
        driver.findElement(By.cssSelector("input#departure")).click();
        List<WebElement> list3= driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
        for(WebElement webElement : list3) {
            if (webElement.getText() == "Thu Dec 16 2021")
                webElement.click();
        }*/


         //   driver.quit();


        }
}

