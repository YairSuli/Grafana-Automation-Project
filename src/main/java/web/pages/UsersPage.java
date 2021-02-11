package web.pages;

import io.qameta.allure.Step;
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

    @Step("get New User button.")
    public WebElement btnNewUser() {
        return btnNewUser;
    }

    @Step("get Users list.")
    public List<WebElement> tbUsers() {
        return tbUsers;
    }
}
