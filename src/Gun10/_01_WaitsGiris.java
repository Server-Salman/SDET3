package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
    Selenium Bekletme Konusu
    Thread.Sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

    Implicitly Wait :
    Tüm sayfadaki elemanlar için bir bekleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
    Bütüm elemanlar için geçerli.NoSuchElement hatası nı vermek için verilen süre kadar,  eleman bulunana kadar bekler.

      driver.manage().timeouts().implicitlyWait(dr);


    pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
 */


public class _01_WaitsGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

//        Duration dr= Duration.ofSeconds(30);
//        driver.manage().timeouts().implicitlyWait(dr);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        btn.click();

        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        BekleKapat();
    }
}
