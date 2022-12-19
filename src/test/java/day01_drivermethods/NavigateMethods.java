package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasına gidelim.
        driver.navigate().to("https://amazon.com");

        // hepsiburada sayfasına gidelim.
        driver.navigate().to("https://techproeducation.com");

       //Tekrar amazon sayfasına donelim.
        driver.navigate().back();//amazon sayfasına geri doner.

        //Tekrar techproeducation sayfasına gidelim.

      /*  try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buradaki amac thread.sleep kullanark bu sayfaya gelmeden 3 saniye bekledik.
       */

        driver.navigate().forward();// back ile donulen sayfadan tekrar ileri doner.

        //Son sayfada sayfayı yenileyelim(refresh)

        driver.navigate().refresh();

        //Ve sayfayı kapatalım.
        driver.close();



























    }
}
