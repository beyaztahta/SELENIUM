package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");//ilk olarak gitmak istedigimiz sayfayi belirtiriz.

        //amazon sayfasının baslıgını yazdırmak istiyoruz:***getTitle***
        System.out.println("Amazon sayfasının baslıgı = " + driver.getTitle());

        //icinde olan sayfanın url sini verir:***getCurrentUrl()***
        System.out.println("Sayfanın url adresi = " + driver.getCurrentUrl());

       //Sayfanın kaynak kodlarını string olarak getirir.
        System.out.println("Sayfanın kodları = " + driver.getPageSource());

        //Bize o window a ait hashcode degerini verir.Biz bu hash degerlerini bir string icine atayıp pencereler arası gecis yapabiliriz.
        //Yeni sekmede acılan pencereye gecmek icin:
        System.out.println("pencereler arası gecis yapmak icin = " + driver.getWindowHandles());


    }
}
