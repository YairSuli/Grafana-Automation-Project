package web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilitiess.Config;

public class Browsers {
    private static final String BROWSER_NAME = Config.get("Browser");

    public static WebDriver getNewDriver(boolean isHeadless) {
        WebDriver driver;

        if (BROWSER_NAME.equals("Chrome")) {
            driver = Browsers.getChromeDriver(isHeadless);
        } else if (BROWSER_NAME.equals("Firefox")) {
            driver = Browsers.getFirefoxDriver();
        } else {
            throw new RuntimeException("Invalid platform name started");
        }
        return driver;
    }

    private static WebDriver getChromeDriver(boolean isHeadless) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(isHeadless);
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
