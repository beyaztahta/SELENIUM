package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods {
    public static void main(String[] args) {
//
//        Amazon soyfasina gidelim. https://www.amazon.com/
//        Sayfanin konumunu ve boyutlarini yazdirin
//        Sayfayi simge durumuna getirin
//        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
//        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
//        Sayfayi fullscreen yapin
//        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
//        Sayfayi kapatin
//
        System.setProperty("System.setProperty(\"webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // Amazon soyfasina gidelim. https://www.amazon.com/
         driver.get("https://www.amazon.com");

         // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları= " + driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        // simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları= " + driver.manage().window().getSize());

        // Sayfayi fullscreen yapin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları= " + driver.manage().window().getSize());

        // Sayfayi kapatin
        driver.close();
    }
}
