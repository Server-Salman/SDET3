package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");


       // elamBul(id den ismi baslik 1, name den)
       // elemanBul(class="footer-top footer-container contain-lg-4 fluid")
    }
}
