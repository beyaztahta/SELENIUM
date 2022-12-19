package day02_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElemetsLocatorsGetMethodları {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim.
        driver.get("https://amazon.com");

        //Search bolumunu locate edip iphone aratalım.
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //Arama sonuc yazısında iphone yazısının locate edip konsola yazdıralım.
        WebElement aramaSonucYazısı=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazısı.getText());


        //Sayfayı kapatalım.
         driver.close();



    }
}
