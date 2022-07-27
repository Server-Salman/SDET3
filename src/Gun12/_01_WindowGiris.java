package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {
       driver.get("https://www.selenium.dev/");

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement link: linkler) {
            if (!link.getAttribute("href").contains("mailto"))
              link.click();
        }

       Set<String> windowIdler=driver.getWindowHandles();
       for(String id: windowIdler)
           System.out.println("id = " + id);

       Bekle(6);
       BekleKapat();
    }
}

//id = CDwindow-FFDA9E84BA6B1D290C9B29F0390B3483
//        id = CDwindow-6A294371A1A2D93A64369F646A935F58
//        id = CDwindow-4805FEB65594742FF78C33B56FC826BE
//        id = CDwindow-9A6EDDCAEB0B9E05C77FBBA734E63AB2
//        id = CDwindow-A2EFCE165C92B89324716C7CA07B1752
//        id = CDwindow-04AD3D623DE0AD6769F67B3F4B0EDA1C
//        id = CDwindow-957F6C66553F3D45993F3C5561BE2725
//        id = CDwindow-2894064125915F9B0DD74711057E319E
//        id = CDwindow-8C75508C0BBFCB0E8829BEB5A9FA30C5
//        id = CDwindow-BBBCC210ABB1E51F52B5C2C998D33768
