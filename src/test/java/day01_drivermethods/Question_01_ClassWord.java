package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_01_ClassWord {
    public static void main(String[] args) {
        /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
       Sayfa basligini(title) yazdirin
       Sayfa basliginin “Amazon” icerdigini test edin
       Sayfa adresini(url) yazdirin
       Sayfa url’inin “amazon” icerdigini test edin.
       Sayfa handle degerini yazdirin
       Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
       Sayfayi kapatin.

         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        //Baslıgı test ettim:
       // String actualTitle= driver.getTitle(); Bunu bir containera da koyarak yapabiliriz.
        System.out.println("SAYFANIN BASLIGI = " + driver.getTitle());
        if(driver.getTitle().contains("Amazon")){
            System.out.println("PASSED");
        }else System.out.println("FAİLED");

        /*Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
         */
        System.out.println("SAYFANIN url ADRESI = " + driver.getCurrentUrl());
        String url= driver.getCurrentUrl();
        if(url.contains("amazon")){
            System.out.println("PASSED");
        }else System.out.println("FAİLED");


        //Sayfa handle degerini yazdirin
        System.out.println("SAYFANIN HANDLE DEGERİ = " + driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String kodtaGatewayVarMı=driver.getPageSource();
        if(kodtaGatewayVarMı.contains("Gateway")){
            System.out.println("Aranılan kelime mevcuttur=PASSED");
        }else System.out.println("Aranılan kelime kullanılmamıstır=FAILED");

        //Sayfayi kapatin.//quity() coklu pencereleri kapatmak icin.
        driver.close();
    }
}
