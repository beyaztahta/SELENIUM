package day01_drivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class ClassWork02 {
    public static void main(String[] args) {
        /*
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Amazon soyfasina gidelim.
        driver.get("https://www.amazon.com");

        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("SAYFANIN KONUMU= " + driver.manage().window().getPosition());
        System.out.println("SAYFANIN BOYUTLARI = " + driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
            driver.manage().window().setPosition(new Point(-7,-7));
            driver.manage().window().setSize(new Dimension(800,600));

            //  Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        System.out.println("SAYFANIN YENI KONUMU = " + driver.manage().window().getPosition());
        System.out.println("SAYFANIN YENI BOYUTU = " + driver.manage().window().getSize());
        if(driver.manage().window().getPosition().equals("driver.manage().window().getPosition()")){
            System.out.println("faıled");
        }else System.out.println("passed");
        // Sayfayi kapatin
       driver.close();






    }
}
