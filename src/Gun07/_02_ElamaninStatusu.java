package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElamaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(sali.isDisplayed()); // görünüyor mu
        System.out.println(sali.isEnabled()); // aktif mi
        System.out.println(sali.isSelected()); // seçili mi
        Bekle(2);

        sali.click();
        System.out.println(sali.isSelected());

        BekleKapat();
    }
}
