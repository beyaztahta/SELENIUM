package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");

//        WebDriver driver= new ChromeDriver();
//        driver.get("https://www.techproeducation.com");

   //
      /*
      En temel haliyle otomasyon yapmak icin Classımıza otomasyon icin gerekli olan webdriver ın yerini gostermemiz gerekir.
      Bunun icin java System.setProperty methodunun icine ilk olarak driver ı yazarız.Ikinci olarak driver ın fiziki yolunu
      kopyalarız; webdriver web tarayıcısını kontrol etmek icin kullanırız
     .*/

        WebDriver drivers=new ChromeDriver(); //objeyi genellikle driver olarak yazılır
        drivers.get("https://www.amazon.com");

    }
}
