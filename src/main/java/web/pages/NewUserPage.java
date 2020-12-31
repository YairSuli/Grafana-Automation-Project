package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserPage extends AbstractPageObject {

    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(1) > input")
    private WebElement txtName;
    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(2) > input")
    private WebElement txtEmail;
    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(3) > input")
    private WebElement txtUserName;
    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(4) > input")
    private WebElement txtPassword;
    @FindBy(css = "body > grafana-app > div > div > div > div > form > div.gf-form-button-row > button")
    private WebElement btnCreate;

    protected NewUserPage(WebDriver driver) {
        super(driver);
    }

    public WebElement txtName() {
        return txtName;
    }

    public WebElement txtEmail() {
        return txtEmail;
    }

    public WebElement txtUserName() {
        return txtUserName;
    }

    public WebElement txtPassword() {
        return txtPassword;
    }

    public WebElement btnCreate() {
        return btnCreate;
    }
}
