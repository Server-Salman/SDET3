package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");

        WebElement ddMenu=driver.findElement(By.id("gh-cat"));
        Select menu=new Select(ddMenu);

        menu.selectByValue("14339");

        Bekle(2);
        WebElement searchBtn=driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();
    }
}
