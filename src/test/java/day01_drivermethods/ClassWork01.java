package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork01 {
    public static void main(String[] args) {
       /*
      Youtube ana sayfasina gidelim . https://www.youtube.com/
      Amazon soyfasina gidelim. https://www.amazon.com/
      Tekrar YouTube’sayfasina donelim
      Yeniden Amazon sayfasina gidelim
      Sayfayi Refresh(yenile) yapalim
      Sayfayi kapatalim / Tum sayfalari kapatalim
        */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Youtube ana sayfasina gidelim .
        driver.get("https://www.youtube.com");

        // Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");

        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

       // Sayfayi kapatalim / Tum sayfalari kapatalim

        driver.close();
        driver.quit();
    }

}
