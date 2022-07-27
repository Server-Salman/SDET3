package Gun11;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        //2-Inputa ülke adı yazınız
        driver.switchTo().frame(0); // frame 1
        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        //3-CheckBox ı çekleyiniz.
        driver.switchTo().frame(0); // frame1 in içinde frame 3 e geçiş yaptım
        WebElement chkBox = driver.findElement(By.id("a"));
        chkBox.click();

//        driver.switchTo().parentFrame();  // su anda frame 1 geri geldim
//        driver.switchTo().parentFrame();  // şu anda ana sayfaya geri geldim.

        driver.switchTo().defaultContent();  // veya direk ana sayfaya gitmenin yolu

        //4-Select in 4.elemanını seçiniz.
        driver.switchTo().frame(1);  // frame2

        WebElement menu=driver.findElement(By.id("animals"));
        Select ddMenu=new Select(menu); // drop down
        ddMenu.selectByIndex(3); // 4.eleman yani 3 indexli eleman seçildi

        BekleKapat();

    }
}


//<body> // defaultContent
//
//    <ifram1 name="IFrame1">  0
//        <iframe  name="IFrame3"></irmae> 0
//    </irmae>
//
//    <ifram1  name="IFrame2"> 1
//    </irmae>
//
//</body>