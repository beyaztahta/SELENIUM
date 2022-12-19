package day02_webelements;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    static WebDriver driver;
    public static void main(String[] args) {
       /*
       Ilk once browseri maxmize yapalım. Tum sayfa icin maksimum bekleme suresi 15 sn belirtelim.
       Sırasıyla amazon,facebook ve yotube sayfalarına gidelim.
       Amazon sayfasına tekrar donelim.
       Amazon sayfasının url inin https://www.amazon.com/ adresine esit oldugunu test edelim.
       Sayfanın konumunu ve pozisyonynun yazdıralım ve
       Sayfanın konumunu ve size nın istedigimiz sekilde ayralayalım,istedigimiz sekilde oldugunu test edelim
       Sayfayı kapatalım.

        */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sırasıyla amazon,facebook ve yotube sayfalarına gidelim.
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().to("https://facebook.com");
        driver.navigate().to("https://youtube.com");

       // Amazon sayfasına tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

       // Amazon sayfasının url inin https://www.amazon.com/ adresine esit oldugunu test edelim.
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        //  Sayfanın konumunu ve pozisyonynun yazdıralım
        System.out.println("Sayfanın olcusu = " + driver.manage().window().getSize());
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());

        // Sayfanın konumunu ve size nın istedigimiz sekilde ayralayalım,istedigimiz sekilde oldugunu test edelim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

        System.out.println("Sayfanın yeni olcusu = " + driver.manage().window().getSize());

        System.out.println("Sayfanın yeni konumu = " + driver.manage().window().getPosition());

      Dimension actualYeniSize=driver.manage().window().getSize();
      if(actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
          System.out.println("passed");
      }else System.out.println("failed");

      Point actualYeniKonum=driver.manage().window().getPosition();
      if(actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
          System.out.println("Konum tesi passed");
      }else System.out.println("Konum testi failed");

      driver.close();

    }
}
