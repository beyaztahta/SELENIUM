package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class ClassWork03 {
    public static void main(String[] args) {
        //1.Yeni bir class olusturun(TekrarTesti)
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsoldayazdirin.
        driver.get("https://www.youtube.com");
        String title=driver.getTitle();
        if(title.contains("youtube")){
            System.out.println("PASSED");
        }else System.out.println("FAILED=>True title: youtube");

        //3.Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yiyazdırın.
        String url=driver.getCurrentUrl();
        if(url.contains("youtube")){
            System.out.println("PASSED");
        }else System.out.println("FAILED=>True url:www.youtube.com");

        //4.Daha sonra Amazon sayfasina gidinhttps://www.amazon.com/
        driver.get("https://amazon.com");

        //5.Youtube sayfasina geri donun
        driver.navigate().back();

        //6.Sayfayi yenileyin
        driver.navigate().refresh();

        //7.Amazon sayfasinadonun
        driver.navigate().forward();

        //8.Sayfayi tamsayfayapin
        driver.manage().window().fullscreen();

        //9.Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title)yazdırın.
       String amazonTitle= driver.getTitle();
       if(amazonTitle.contains("Amazon")){
           System.out.println("PASSED");
       }else System.out.println("FAILED=>Actual Title:Amazon");

        //10.Sayfa URL'sinin https://www.amazon.com/olup olmadığını doğrulayın, degilsedoğru
        String newUrl=driver.getCurrentUrl();
        if(newUrl.contains("https://www.amazon.com")){
            System.out.println("PASSED");
        }else
            System.out.println("FAILED=> True url: https://www.amazon.com");

        //URL'yiyazdırın
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //11.Sayfayikapatin
        driver.close();

    }
}
