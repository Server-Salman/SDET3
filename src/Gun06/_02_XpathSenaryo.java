package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.junit.Assert;

public class _02_XpathSenaryo extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        Bekle(3);
        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Bekle(1);
        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Bekle(1);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Bekle(1);

        //1.ürün
        WebElement BackpackElement=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        BackpackElement.click();
        Bekle(1);
        WebElement addToCart=driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        Bekle(1);
        WebElement buttonBack=driver.findElement(By.xpath("//button[text()='Back to products']"));
        buttonBack.click();
        Bekle(1);

        //2.ürün
        WebElement boltTshirtTextElement=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirtTextElement.click();
        Bekle(1);
        WebElement addToCart2=driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        Bekle(1);

        WebElement sepet=driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        sepet.click();
        Bekle(1);

        WebElement buttonCheckOut=driver.findElement(By.xpath("//*[text()='Checkout']"));
        buttonCheckOut.click();
        Bekle(1);

        WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.sendKeys("ismet");
        Bekle(1);
        WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.sendKeys("temur");
        Bekle(1);
        WebElement zipcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
        zipcode.sendKeys("12345");
        Bekle(1);

        WebElement btnContinue=driver.findElement(By.xpath("//*[@id='continue']"));
        btnContinue.click();
        Bekle(1);

        //(//*[@class='inventory_item_price'])[1]
        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement e: ucretler) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        // double çevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
        WebElement webAltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println(webAltToplam.getText());
        double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        if (toplam == altToplam)
            System.out.println("test passed");
        else
            System.out.println("test failed");


        Assert.assertTrue(toplam == altToplam);
        //Assert.assertEquals("merhaba", "merhaba1");

        BekleKapat();
    }
}
