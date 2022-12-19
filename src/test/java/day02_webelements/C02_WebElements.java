package day02_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElements {
   static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim.
        driver.get("https://amazon.com");

        //Search bolumunu locate edelim.
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

//        WebElement aramaKutusu1= driver.findElement(By.name("field-keywords"));

        //Search bolumunde iphone aratalım.
        aramaKutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir web elementi(web sayfasındakimher bir buton yada text/yazı) locate(konumunu belirleme) etmek istersek
        once manuel olarak  web sayfasını acıp sayfa uzerinde sag cick yapı incele ye tıklarız.Karsımıza cıkan html kodalrından
        locater(konum belirleyiciler)lardan essizolanı seceriz.Genellikle id attribute u kullanaılr.Sectigimiz attribute degerini
        findElement() methodu icine findElement(By.id("attribute degeri"))seklinde yazarız.
         */

        //Amazon sayfasındaki <input> ve <a> taglarının sayısını yazdırınız.
        List<WebElement>inputTags=driver.findElements(By.tagName("input"));
        System.out.println("input tag sayısı "+ inputTags.size());

        List<WebElement>linklerList=driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayısı = " + linklerList.size());
        for (WebElement w:linklerList) {
            System.out.println(w.getText());
        }





    }
}
