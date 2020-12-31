package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage extends AbstractPageObject {
    @FindBy(css = "body > grafana-app > div > div > div > div > div.page-action-bar > a")
    private WebElement btnNewUser;

    @FindBy(css = "body > grafana-app > div > div > div > div > div.admin-list-table > table > tbody > tr ")
    private List<WebElement> tbUsers;

    protected UsersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement btnNewUser() {
        return btnNewUser;
    }

    public List<WebElement> tbUsers() {
        return tbUsers;
    }
}
