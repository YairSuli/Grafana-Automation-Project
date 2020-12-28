package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageObject {

    protected AbstractPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
