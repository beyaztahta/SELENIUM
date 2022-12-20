package day02_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Testodev {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //1-Test01 isimli bir class olusturun


        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // //2- https://www.amazon.com/ adresine gidin 3- Browseri tam sayfa yapin
        driver.get("https://www.amazon.com/");

            Thread.sleep(5000);


        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();


        //5-”"Salesforce Apex Questions Bank"” icin arama yapiniz
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);


        //6- Kac sonuc bulundugunu yaziniz
      List<WebElement>list =driver.findElements(By.tagName("div"));

      for(WebElement w:list){
          System.out.println(w.getText());
      }

        System.out.println(list.size());
        //7-Sayfayi kapatin
        driver.close();
    }

}
