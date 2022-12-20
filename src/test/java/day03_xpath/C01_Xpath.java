package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
      /*
      Thread.sleep(3000);
        //WebElement addButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //               <button onclick="addElement()">Add Element</button>
        // Xpath kullanımında locate edeceğimiz webelement text'e sahipse yukardaki şekilde kullanabiliriz
        addButtonT.click();
       */

        //3-Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButonu.isDisplayed()){
            System.out.println( "TEST PASSED");
        }else System.out.println("TEST FAILED");
        //bir web elementin gorunur olup olmadıgını dogrulamak icin isDisplayed() methodu kullanırız. true  ve faklse dondurur.

        //4-Delete tusuna basin
        Thread.sleep(5000);
       deleteButonu.click();


        //5-“Add/Remove Elements” yazisinin gorunur oldugunu test edin
       WebElement elementYazısı= driver.findElement(By.xpath("//h3"));
        if(elementYazısı.isDisplayed()){
            System.out.println( "TEST PASSED");
        }else System.out.println("TEST FAILED");

    }
    //webElement.isEnable();Web Element erisilebilir ise true yoksa false doner
    //webElement.isSelected( ); Web Element secili ise true yoksa false doner
}
