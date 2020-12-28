package web.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPages {

    protected final WebDriver driver;

    protected AbstractPages(WebDriver driver) {
        this.driver = driver;
    }
}
