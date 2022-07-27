package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */
public class _04_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
      driver.get("https://triplebyte.com/");

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript( "window.scrollBy(0,1500)");
        // (0,1500) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 1500 px kadar aşağı kaydıracak.

        Bekle(2);
        js.executeScript( "window.scrollBy(0,-1500)");

     BekleKapat();
    }
}
