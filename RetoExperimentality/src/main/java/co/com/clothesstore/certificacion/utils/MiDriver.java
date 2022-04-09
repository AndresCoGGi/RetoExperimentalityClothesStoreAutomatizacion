package co.com.clothesstore.certificacion.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiDriver {

    private static WebDriver driver;

    public static MiDriver web() {
        System.setProperty("webdriver.chrome.driver",
                "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
        driver = new ChromeDriver(options);
        return new MiDriver();
    }

    public WebDriver enLaPagina(String url) {
        driver.get(url);
        return driver;
    }

}
