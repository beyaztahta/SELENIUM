package day02_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TekrarTesti {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucYazısı=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazısı.getText());

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    }

}
