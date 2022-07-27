package Gun12;

/*
   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teer teker kapatınız
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWinddowId= driver.getWindowHandle(); // bulunduğun sayfanın win id si

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement link: linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowsIdler=driver.getWindowHandles();  // açık olan tüm sayfaların win id leri

        for(String id: windowsIdler) {
            if (id.equals(anaSayfaWinddowId))
                continue; // ana sayfa değilse

            driver.switchTo().window(id); // diğer sayfaya (windowa) geçiş yaptık
            System.out.println(id + " - Title = " + driver.getTitle());
            driver.close();
        }

        Bekle(3);
        BekleKapat();
    }
}
