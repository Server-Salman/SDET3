package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_FindingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        WebElement element= driver.findElement(By.linkText("Siparişlerim")); // SADECE a tag lerinde çalışır
        System.out.println("element.getText() = " + element.getText());

        System.out.println("element.getAttribute(title) = " + element.getAttribute("title"));
        System.out.println("element.getAttribute(href) = " + element.getAttribute("href"));
        System.out.println("element.getAttribute(rel) = " + element.getAttribute("rel"));

        WebElement element2= driver.findElement(By.partialLinkText("Süper Fiyat")); // SADECE a tag lerinde çalışır
        System.out.println("element2.getText() = " + element2.getText());

        BekleKapat();
    }
}
