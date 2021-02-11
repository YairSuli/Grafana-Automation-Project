package web.pages.menu;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.AbstractPageObject;

public class ServerAdminPage extends AbstractPageObject {

    @FindBy(css = "a[href='/admin/users']")
    private WebElement btnUsers;

    public ServerAdminPage(WebDriver driver) {
        super(driver);
    }

    @Step("get Users button.")
    public WebElement btnUsers() {
        return btnUsers;
    }
}
