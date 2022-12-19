package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_02_ {
    public static void main(String[] args) {
      /*  ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
         Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin
        .Browser’i kapatin
        */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com");
        String baslık=driver.getTitle();
        if(baslık.contains("facebook")){
            System.out.println("PASSED");
        }else System.out.println("FAILED:Istenilen baslık facebook tur.");

       // Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        String url=driver.getCurrentUrl();
        if(url.contains("facebook")){
            System.out.println("PASSED");
        }else System.out.println("ACTUAL");

       // https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String title=driver.getTitle();
        if(title.contains("Walmart.com")){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        // .Browser’i kapatin
        driver.close();
    }
}
