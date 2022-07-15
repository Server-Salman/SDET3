package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _06_FindingElements_tag extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> liste=driver.findElements(By.tagName("a"));
        for(WebElement e: liste)
            System.out.println("e.getText() = " + e.getText());

        BekleKapat();
    }
}
