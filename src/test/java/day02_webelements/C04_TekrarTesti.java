package day02_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_TekrarTesti {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();//acılan browserı tam ekran yap.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazısı=driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramaSonucYazısı  " + aramaSonucYazısı.get(0).getText());

        //Arama sonuc sayısını konsola yazdırınız.
        String []sonucSayısı=aramaSonucYazısı.get(0).getText().split(" ");
        System.out.println("sonucSayısı ="+sonucSayısı[2]);

        //Sonuc sayısını lambda ile yazdırınız.
        Arrays.stream(aramaSonucYazısı.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
      List<WebElement>image=driver.findElements(By.className("s-image"));
      image.get(0).click();




    }

}
