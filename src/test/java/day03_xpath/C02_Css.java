package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Css {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 2-https://www.amazon.com/adresine gidin
        driver.get("https://www.amazon.com/");

        //4-Sayfayi “refresh”yapin
        Thread.sleep(3000);
        driver.navigate().refresh();

        //5-Sayfa basliginin “Spend less” ifadesi icerdigini testedin
        String baslık= driver.getTitle();
        String arananKelime="Spend less";
        if(baslık.contains(arananKelime)){
            System.out.println( "TEST PASSED.");
        }else System.out.println("TEST FAILED");

        //6-Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();


        //7-Birthday butonuna basin
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();
//"img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png'"

        //8-Best Seller bolumunden ilk urunu tiklayin
        List<WebElement>bestSellerBolumu=driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSellerBolumu.get(0).click();

        // 9-Gift card details’den 25 $’isecin
       driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();

        //10-Urun ucretinin 25$ oldugunu testedin

        WebElement urunUcreti= driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if(urunUcreti.getText().equals("$25.00")){
            System.out.println("test passed");
        }else System.out.println("test failed");

        //11-Sayfayikapatin
        driver.close();
    }
}
