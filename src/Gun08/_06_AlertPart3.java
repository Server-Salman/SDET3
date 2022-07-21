package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        Bekle(2);
        WebElement clicMe1=driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clicMe1.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText()); // alert in TEXT i alındı
        driver.switchTo().alert().sendKeys("ismet"); // Alert kutucuguna gecildi text gönderildi
        driver.switchTo().alert().accept(); // Ok butonuna basildi mi yazsak
        Bekle(2);

        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("ismet"));

        BekleKapat();
    }
}
