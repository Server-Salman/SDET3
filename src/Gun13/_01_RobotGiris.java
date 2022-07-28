package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */


public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        //TODO: frame gözükene kadar bekle eklenecek
        //toDO: frame in varlığı kontrol edilip var ise veya yok ise her iki duruma göre çözüm yapılacak
        Bekle(3);
        driver.switchTo().frame(8);  //"gdpr-consent-notice"
        WebElement acceptAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
        //WebElement acceptAll = driver.findElement(By.xpath("//span[text()='Accept All']"));
        acceptAll.click();
        driver.switchTo().defaultContent();

        Robot rbt=new Robot();

        for(int i=0;i<13;i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
            Bekle(1  );
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

        // Stringi hafızaya-clipboard a kopyalama kodu   Ctrl+C  "C:\Users\TechnoStudy\Desktop\ornek.txt"
        StringSelection stringSelection = new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.
        Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);     // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı

        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);  // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        for(int i=0;i<2;i++) {  // 2 kere tab ile OPEN butonuna ulaştık
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
            Bekle(1  );
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down   // ENTER bastık açılan pencere kapandı
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

        WebElement submitbutton = driver.findElement(By.id("submitbutton"));  // submıt butonuna bastık
        submitbutton.click();

        WebElement asser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));

        //Assert.assertTrue(driver.getPageSource().contains("has been successfully uploaded."));



        // BekleKapat();
    }
}
